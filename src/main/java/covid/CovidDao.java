package covid;

import activitytracker.Activity;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void massRegistration(List<Citizen> citizens) {
        for (Citizen citizen : citizens) {
            insertCitizen(citizen);
        }
        System.out.println("A tömeges regisztráció megtörtént!");
    }

    public Map<Long, Long> queryReport(String zipToFind) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement(
                        "SELECT number_of_vaccination FROM citizens WHERE zip = ?")) {
            stmt.setString(1, zipToFind);

            Map<Long, Long> result = parseResultSet(stmt);
            return result;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection failed!", sqle);
        }

    }

    private Map<Long, Long> parseResultSet(PreparedStatement stmt) {
        try (ResultSet rs = stmt.executeQuery()) {
            List<Long> list = new ArrayList<>();
            if (!rs.next()) {
                return null;
            }
            while (rs.next()) {
                long num = rs.getLong("number_of_vaccination");
                list.add(num);
            }
            Map<Long, Long> result = fillMap(list);

            return result;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot execute", sqle);
        }
    }

    private Map<Long, Long> fillMap(List<Long> list) {
        Map<Long, Long> result = new HashMap<>();
        for (long k = 0; k < 3; k++) {
            long sum = 0;
            for (Long num : list) {
                if (num == k) {
                    sum++;
                }
                result.put(k, sum);
            }
        }
        return result;
    }

}
