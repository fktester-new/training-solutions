package covid;

import activitytracker.Activity;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class CovidDao {

    private DataSource dataSource;

    public CovidDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertCitizen(Citizen citizen) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("INSERT INTO citizens(citizen_name, zip, age, email, taj,number_of_vaccination) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, citizen.getCitizen_name());
            stmt.setString(2, citizen.getZip());
            stmt.setLong(3, citizen.getAge());
            stmt.setString(4, citizen.getEmail());
            stmt.setString(5, citizen.getTaj());
            stmt.setLong(6, citizen.getNumber_of_vaccination());
            stmt.executeUpdate();

        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }
    }

    public void massRegistration(List<Citizen> citizens){
        for (Citizen citizen : citizens) {
            insertCitizen(citizen);
        }
        System.out.println("A tömeges regisztráció megtörtént!");
    }

}
