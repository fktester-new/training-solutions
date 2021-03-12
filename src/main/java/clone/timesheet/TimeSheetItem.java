package clone.timesheet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem timeSheetItem){
        employee = timeSheetItem.employee;
        project = timeSheetItem.project;
        from = timeSheetItem.from;
        to = timeSheetItem.to;
    }

    public static TimeSheetItem withDifferentDay(TimeSheetItem timeSheetItem, LocalDate date){
        TimeSheetItem newTimeSheetItem = new TimeSheetItem(timeSheetItem);

        LocalTime fromTime = timeSheetItem.getFrom().toLocalTime();
        LocalTime toTime = timeSheetItem.getTo().toLocalTime();

        LocalDateTime newFrom = LocalDateTime.of(date, fromTime);
        LocalDateTime newTo = LocalDateTime.of(date, toTime);

        newTimeSheetItem.from = newFrom;
        newTimeSheetItem.to = newTo;

        return newTimeSheetItem;

    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}

