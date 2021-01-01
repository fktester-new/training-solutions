package statemachine.elevator;

public class GroundFloorOpen implements ElevatorState{

    public GroundFloorOpen(Elevator elevator){
        elevator.setCalledOnGroundFloor(false);
        if (elevator.isCalledOnFirstFloor()){
            elevator.setDirection(DirectionType.UP);
        }
        if (elevator.getDirection() == DirectionType.DOWN){
            elevator.setDirection(DirectionType.NONE);
        }
    }

    @Override
    public String getStateInfo() {
        return "Ground Floor Open";
    }

    @Override
    public void changeState(Elevator elevator) {
        elevator.setState(new GroundFloorClosed());
    }
}
