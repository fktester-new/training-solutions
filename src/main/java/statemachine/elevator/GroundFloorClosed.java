package statemachine.elevator;

import static statemachine.elevator.DirectionType.DOWN;
import static statemachine.elevator.DirectionType.UP;

public class GroundFloorClosed implements ElevatorState{

    @Override
    public String getStateInfo() {
        return "Ground Floor Closed";
    }

    @Override
    public void changeState(Elevator elevator) {
        switch (elevator.getDirection()){
            case DOWN:
                elevator.setState(new GroundFloorOpen(elevator));
                break;
            case UP:
                if (elevator.isCalledOnFirstFloor())
                    elevator.setState(new GroundFloorOpen(elevator));
                else
                    elevator.setState(new FirstFloorClosed());
                break;
        }
    }
}
