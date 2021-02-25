package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

    public void insertActivity(DataSource dataSource, Activity activity) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("INSERT INTO activities(start_time, activity_desc, activity_type) VALUES (?, ?, ?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
    }

    private Activity selectActivityByPreparedStatement(PreparedStatement stmt){
        try (ResultSet rs = stmt.executeQuery()){
            if (rs.next()){
                Activity activity = new Activity(rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type")));
                return activity;
            }
            throw new IllegalArgumentException("Wrong input!");
        } catch (SQLException se){
            throw new IllegalStateException("Cannot execute", se);
        }
    }

    public List<Activity> selectAllActivities(DataSource dataSource){
        List<Activity> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select *  from activities");
             ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                Activity activity = new Activity(rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException se){
            throw new IllegalStateException("Connection failed!", se);
        }
    }

    public Activity selectActivityById(DataSource dataSource, long id){
        try (
                Connection conn = dataSource.getConnection();
        PreparedStatement stmt =
                conn.prepareStatement("select * from activities where id = ?")){
            stmt.setLong(1, id);

            return selectActivityByPreparedStatement(stmt);
        }
        catch (SQLException se){
            throw new IllegalStateException("Can not connect!", se);
        }
    }

    public static void main(String[] args) {

        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("can not create datasource", se);
        }

        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 22), "Biking in Bakony", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 22), "Hiking in Bakony", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 22), "Running in Bakony", ActivityType.RUNNING);

        ActivityTrackerMain atm = new ActivityTrackerMain();

        atm.insertActivity(dataSource, activity);
        atm.insertActivity(dataSource, activity2);
        atm.insertActivity(dataSource, activity3);
        System.out.println(atm.selectActivityById(dataSource, 2));
        System.out.println(atm.selectAllActivities(dataSource));
    }
}
