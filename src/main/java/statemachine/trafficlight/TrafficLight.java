package statemachine.trafficlight;

public enum TrafficLight {

    RED{
        TrafficLight next(){
            return RED_YELLOW;
        }
    },
    RED_YELLOW{
        TrafficLight next(){
            return GREEN;
        }
    },
    GREEN{
        TrafficLight next(){
            return YELLOW;
        }
    },
    YELLOW{
        TrafficLight next(){
            return RED;
        }
    };
    abstract TrafficLight next();
}
