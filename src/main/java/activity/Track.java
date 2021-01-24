package activity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMinimumCoordinate() {
        if (trackPoints.isEmpty()) {
            throw new IllegalArgumentException("No points");
        }
        double minLat = trackPoints.get(0).getCoordinate().getLatitude();
        double minLon = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() < minLat) {
                minLat = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() < minLon) {
                minLon = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLat, minLon);
    }

    public Coordinate findMaximumCoordinate() {
        if (trackPoints.isEmpty()) {
            throw new IllegalArgumentException("No points");
        }
        double maxLat = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLon = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() > maxLat) {
                maxLat = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() > maxLon) {
                maxLon = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLat, maxLon);
    }

    public double getRectangleArea() {
        double latDiff = this.findMaximumCoordinate().getLatitude() - this.findMinimumCoordinate().getLatitude();
        double lonDiff = this.findMaximumCoordinate().getLongitude() - this.findMinimumCoordinate().getLongitude();

        return latDiff * lonDiff;
    }

    public double getDistance(){
        double sum = 0;
        TrackPoint prev = trackPoints.get(0);
        for (TrackPoint actual : trackPoints) {
            sum += prev.getDistanceFrom(actual);
            prev = actual;
        }
        return sum;
    }

    public double getFullElevation(){
        double elevationSum = 0;
        TrackPoint prev = trackPoints.get(0);

        for (TrackPoint actual : trackPoints) {
             if (actual.getElevation() > prev.getElevation()){
                 elevationSum += actual.getElevation() -prev.getElevation();
             }
            prev = actual;
        }
        return elevationSum;
    }

    public double getFullDecrease(){
        double decreaseSum = 0;
        TrackPoint prev = trackPoints.get(0);

        for (TrackPoint actual : trackPoints){
            if (actual.getElevation() < prev.getElevation()){
                decreaseSum += prev.getElevation() - actual.getElevation();
            }
            prev = actual;
        }
        return decreaseSum;
    }

    public void loadFromGpx(InputStream inputStream){
        trackPoints = new LoadFile().loadFromGpx(inputStream);
    }
}
