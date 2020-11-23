package controlselection.greetings;

public class Greetings {

    public String sayGreeting(int hour, int minute) {
        String greeting;
        if (hour < 5 || hour == 5 && minute == 0) {
            greeting = "Good Night!";
        } else if (hour < 9 || hour == 9 && minute == 0) {
            greeting = "Good Morning!";
        } else if((hour <= 17) || (hour == 18 && minute <= 30)) {
            greeting = "Good Afternoon!";
        } else if(hour < 20 || hour == 20 && minute == 0) {
            greeting = "Good Evening!";
        } else {
            greeting = "Good Night!";
        }
        return greeting;
    }
}
