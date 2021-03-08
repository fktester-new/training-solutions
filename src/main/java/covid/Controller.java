package covid;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Controller {

    private Validator validator = new Validator();


    public void printMenu(){
        System.out.println("Oltás regisztráló menü");
        System.out.println();
        System.out.println(
                "1. Regisztráció \n" +
        "2. Tömeges regisztráció \n" +
        "3. Generálás \n" +
        "4. Oltás \n" +
        "5. Oltás meghiúsulás \n" +
        "6. Riport \n" +
        "7. Kilépés \n");
    }



        public void runMenu(CovidDao covidDao){
        printMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Válasszon menüpontot:");
        String menuItem = scanner.nextLine();

        switch(menuItem){
            case "1":
                Citizen citizen = validator.validateRegistration();
                covidDao.insertCitizen(citizen);
                break;
            case "2":
                List<Citizen> citizens = validator.importCsvFile();
                covidDao.massRegistration(citizens);
                break;
            case "3":
                //massRegistration();
                break;
            case "4":
                //manageVaccination();
                break;
            case "5":
                //vaccinationFailure();
                break;
            case "6":
                String zipToFind = validator.generateReport();
                Map<Long, Long> numbers = covidDao.queryReport(zipToFind);
                validator.writeReport(zipToFind, numbers);
                break;
            case "7":
                System.out.println("Viszontlátásra!");
                break;
            default:
                System.out.println("Nincs ilyen menüpont");
                System.out.println("Próbálja meg újra!");
                printMenu();
                break;

        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");
        } catch (SQLException se) {
            throw new IllegalStateException("can not create datasource", se);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        CovidDao covidDao = new CovidDao(dataSource);

        controller.runMenu(covidDao);
    }

}
