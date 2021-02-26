package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {
    ActivityDao activityDao;

    @BeforeEach
    public void init(){
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed!", se);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    public void selectAlltest(){
        assertEquals(3, activityDao.selectAllActivities().size());
    }

    @Test
    public void testInsertActivity(){
        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 22), "Biking in Bakony", ActivityType.BIKING);
        activityDao.insertActivity(activity);

        assertEquals(4, activityDao.selectAllActivities().size());
    }

    @Test
    public void selectBeforeDateTest(){
        System.out.println(activityDao.selectActivityBeforeDate(LocalDate.of(2020, 2, 1)));

    }

    @Test
    public void findByIdTest(){
        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 22), "Biking in Bakony", ActivityType.BIKING);
        Activity result = activityDao.insertActivity(activity);
        assertEquals("Biking in Bakony", activityDao.selectActivityById(result.getId()).getDesc());
    }
}