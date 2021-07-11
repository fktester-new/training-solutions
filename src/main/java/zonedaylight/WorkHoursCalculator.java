package zonedaylight;

import java.time.*;

public class WorkHoursCalculator {

    private ZonedDateTime startDateTime;

    public WorkHoursCalculator(int startYear, Month startMonth, int startDay, int startHour, ZoneId zone){
        this.startDateTime = ZonedDateTime.of(LocalDateTime.of(startYear, startMonth.getValue(), startDay, startHour, 0),zone);
    }

    public ZonedDateTime getStartDateTime() {
        return startDateTime;
    }

    public long calculateHours(int year, Month month, int day, int hour){
        ZonedDateTime end = ZonedDateTime.of(year, month.getValue(), day, hour, 0, 0, 0, startDateTime.getZone());
        Duration duration = Duration.between(startDateTime, end);
        return duration.toHours();
    }
}
