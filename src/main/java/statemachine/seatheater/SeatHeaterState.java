package statemachine.seatheater;

public enum SeatHeaterState {
    OFF{
        SeatHeaterState next(){
            return THREE;
        }
    },
    THREE{
        SeatHeaterState next(){
            return TWO;
        }
    },
    TWO{
        SeatHeaterState next(){
            return ONE;
        }
    },
    ONE{
        SeatHeaterState next(){
            return OFF;
        }
    };
        abstract SeatHeaterState next();
}
