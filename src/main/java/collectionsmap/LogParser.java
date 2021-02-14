package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class LogParser {

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Map<String, List<Entry>> parseLog(String log){

        try(Scanner scanner = new Scanner(log)){
            Map<String, List<Entry>> result = new HashMap<>();
            while(scanner.hasNext()){
                String line = scanner.next();
                String[] temp = line.split(":");
                if (temp.length != 3){
                    throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
                }
                LocalDate entryDate = parseDate(temp[1]);
                Entry newEntry = new Entry(temp[0], entryDate, temp[2]);
                loadMap(result, newEntry);
            }
            return result;
        }
    }

    private void loadMap(Map<String, List<Entry>> elements, Entry entry){
        if (!elements.containsKey(entry.getIpAddress())){
            elements.put(entry.getIpAddress(), new ArrayList<>());
        }
        elements.get(entry.getIpAddress()).add(entry);
    }

    private LocalDate parseDate(String date){
        try
        {
           return LocalDate.parse(date, DATE_FORMAT);
        }
        catch(DateTimeParseException pe){
            throw new IllegalArgumentException("Incorrect log: incorrect date");
        }
    }

}
