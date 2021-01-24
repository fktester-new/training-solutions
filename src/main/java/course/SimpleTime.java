package course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        setTime(hour, minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public SimpleTime(String time) {
        if (time == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (time.length() != "hh:mm".length() || time.charAt(2) != ':') {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int h;
        try {
            h = Integer.parseInt(time.substring(0, time.indexOf(":")));
        } catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int m;
        try {
            m = Integer.parseInt(time.substring(time.indexOf(":") + 1));
        } catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        setTime(h, m);
    }

    private void setTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
                this.hour = hour;
                this.minute = minute;
            }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }
}
