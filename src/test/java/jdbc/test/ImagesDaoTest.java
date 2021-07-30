package jdbc.test;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class ImagesDaoTest {
    private ImagesDao imagesDao;

    @BeforeEach
    public void init(){
        MariaDbDataSource dataSource;
        try{
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("can not create datasource", se);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        imagesDao = new ImagesDao(dataSource);
    }

    @Test
    public void saveImageTest() throws IOException {
        imagesDao.saveImage("training360.png", ImagesDaoTest.class.getResourceAsStream("/training360.png"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try(InputStream is = imagesDao.getImageByName("training360.png")){
            is.transferTo(baos);
        }
        assertTrue(baos.size() > 4000,"File size");
    }


}