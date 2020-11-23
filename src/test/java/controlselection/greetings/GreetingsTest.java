package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    @Test


    public void testGreeting() {
        Greetings greetings = new Greetings();
        assertEquals("Good Night!", greetings.sayGreeting(4, 30));
        assertEquals("Good Night!", greetings.sayGreeting(5, 0));
        assertEquals("Good Morning!", greetings.sayGreeting(5, 1));
        assertEquals("Good Morning!", greetings.sayGreeting(9, 0));
        assertEquals("Good Afternoon!", greetings.sayGreeting(9, 1));
        assertEquals("Good Afternoon!", greetings.sayGreeting(18, 30));
        assertEquals("Good Evening!", greetings.sayGreeting(18, 31));
        assertEquals("Good Evening!", greetings.sayGreeting(20, 0));
        assertEquals("Good Night!", greetings.sayGreeting(20, 1));
        }
}