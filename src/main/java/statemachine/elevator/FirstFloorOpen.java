package statemachine.elevator;

public class FirstFloorOpen implements ElevatorState{

    public FirstFloorOpen(Elevator elevator){
        elevator.setCalledOnFirstFloor(false);
        if (elevator.isCalledOnFirstFloor()) {
            elevator.setDirection(DirectionType.DOWN);
        }
        if (elevator.getDirection() == DirectionType.UP) {
            elevator.setDirection(DirectionType.NONE);
        }
    }

    @Override
    public String getStateInfo() {
        return "First Floor Open";
    }

    @Override
    public void changeState(Elevator elevator) {
        elevator.setState(new FirstFloorClosed());
        }
}

