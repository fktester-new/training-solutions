package inheritanceconstructor.classroom;

public class ClassRoom extends Room{

    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility){
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable(Course course){
        return (getCapacity() >= course.getParticipants() && getFacility() == course.getFacilityNeeded());
    }

    public Facility getFacility() {
        return facility;
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }
}
