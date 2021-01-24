package activity;

public class Coordinate {

    public static final double MIN_LATITUDE = -90;
    public static final double MAX_LATITUDE = 90;
    public static final double MIN_LONGITUDE = -180;
    public static final double MAX_LONGITUDE = 180;

    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        if (latitude < MIN_LATITUDE || latitude > MAX_LATITUDE){
            throw new IllegalArgumentException("Invalid latitude");
        }
        this.latitude = latitude;
        if (longitude < MIN_LONGITUDE || longitude > MAX_LONGITUDE){
            throw new IllegalArgumentException("Invalid longitude");
        }
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
