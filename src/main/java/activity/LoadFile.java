package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LoadFile {

    private List<TrackPoint> trackPoints = new ArrayList<>();
    private Coordinate coordinate = null;

    public Coordinate parseCoordinate(String line){
        double lat = Double.parseDouble(line.substring(15, 25));
        double lon = Double.parseDouble(line.substring(32, 42));

        return new Coordinate(lat, lon);
    }
    public double parseElevation(String line){
        return Double.parseDouble(line.substring(9, 14));
        }
    public void parseLine(String line){
        if (line.contains("<trkpt")){
            coordinate = parseCoordinate(line);
        }
        if(line.contains("<ele")){
           double ele = parseElevation(line);
           TrackPoint trackPoint = new TrackPoint(coordinate, ele);
           trackPoints.add(trackPoint);
        }
    }

    public List<TrackPoint> loadFromGpx(InputStream inputStream){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while((line = br.readLine()) != null){
                parseLine(line);
            }
        } catch (IOException | NullPointerException e){
            throw new IllegalStateException("Can not read file", e);

        }
        return trackPoints;
    }
}
