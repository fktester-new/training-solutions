package collectionsmap;

import java.time.LocalDate;

public class Entry {

    public String ipAddress;
    private LocalDate entryDate;
    private String login;

    public Entry(String ipAddress, LocalDate entryDate, String login) {
        this.ipAddress = ipAddress;
        this.entryDate = entryDate;
        this.login = login;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }
}
