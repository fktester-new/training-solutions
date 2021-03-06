package covid;

import java.time.LocalDate;

public class Citizen {

    private long citizen_id;
    private String citizen_name;
    private String zip;
    private long age;
    private String email;
    private String taj;
    private long number_of_vaccination;
    private LocalDate last_vaccination;

    public Citizen(String citizen_name, String zip, long age, String email, String taj) {
        this.citizen_name = citizen_name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.number_of_vaccination = 0;
    }

    public long getCitizen_id() {
        return citizen_id;
    }

    public String getCitizen_name() {
        return citizen_name;
    }

    public String getZip() {
        return zip;
    }

    public long getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public long getNumber_of_vaccination() {
        return number_of_vaccination;
    }

    public LocalDate getLast_vaccination() {
        return last_vaccination;
    }
}
