package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    public void printNames(){
        for (MeetingRoom mr : meetingRooms) {
            System.out.println(mr.getName());
        }
    }

    public void getAreasLargerThan(int area) {
        for (MeetingRoom mr: meetingRooms) {
            if (mr.getArea()>area){
                System.out.println("Name: " + mr.getName());
                System.out.println("Width: " + mr.getWidth());
                System.out.println("Length: " + mr.getLength());
                System.out.println("Area: " + mr.getArea());

            }
        }
    }

    public void printNamesReverse() {
        for(int i = meetingRooms.size()-1; i >= 0; i--){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames(){
        for (int i = 0; i < meetingRooms.size(); i +=2){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas(){
        for (MeetingRoom mr : meetingRooms) {
            System.out.println("Name: " + mr.getName());
            System.out.println("Width: " + mr.getWidth());
            System.out.println("Length: " + mr.getLength());
            System.out.println("Area: " + mr.getArea());
        }

    }

    public void printMeetingRoomsWithName(String name) {

        for (MeetingRoom mr : meetingRooms) {
            if(name.equals(mr.getName())){
                System.out.println("Name: " + mr.getName());
                System.out.println("Width: " + mr.getWidth());
                System.out.println("Length: " + mr.getLength());
                System.out.println("Area: " + mr.getArea());
            }
        }
    }

    public void printMeetingRoomsContains(String text){

        for (MeetingRoom mr : meetingRooms) {
            if(mr.getName().toLowerCase().contains(text.toLowerCase())){
                System.out.println("Name: " + mr.getName());
                System.out.println("Width: " + mr.getWidth());
                System.out.println("Length: " + mr.getLength());
                System.out.println("Area: " + mr.getArea());
            }
        }
    }
}
