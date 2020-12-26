package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime simpleTime){
        this(simpleTime.getHours(), simpleTime.getMinutes());
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int difference(SimpleTime time){
return timeInMinutes() - time.timeInMinutes();
    }

    private int timeInMinutes(){
        return hours * 60 + minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
