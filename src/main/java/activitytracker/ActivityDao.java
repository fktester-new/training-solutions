package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertActivity(Activity activity) {
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

    private List<Activity> selectActivityByPreparedStatement(PreparedStatement stmt) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot execute", se);
        }
    }

    public List<Activity> selectAllActivities() {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select *  from activities")) {

            return selectActivityByPreparedStatement(ps);
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed!", se);
        }
    }

    public Activity selectActivityById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select * from activities where id = ?")) {
            stmt.setLong(1, id);

            List<Activity> result = selectActivityByPreparedStatement(stmt);

            if (result.size() == 1) {
                return result.get(0);
            }
            throw new IllegalArgumentException("Wrong id!");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect!", se);
        }
    }

    public List<Activity> selectAllActivitiesByType(ActivityType type) {

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select * from activities where activity_type = ?")) {
            stmt.setString(1, type.toString());
           return selectActivityByPreparedStatement(stmt);

        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed!");
        }
    }
}
