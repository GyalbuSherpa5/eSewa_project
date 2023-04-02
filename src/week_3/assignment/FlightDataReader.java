package week_3.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;


public class FlightDataReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\eSewa_Intern\\src\\week_3" +
                "\\assignment\\MOCK_FLIGHT_DATA.csv"));

        // Reading from csv file and saving to this arrayList
        ArrayList<FlightData> flight = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");

            if (split[0].equals("flight_id")) {
                continue;
            }

            String flightId = split[0];
            int currAltitude = Integer.parseInt(split[1].isEmpty() ? String.valueOf(0) : split[1]);
            String destinationAirportCode = split[2];
            String deptTime = split[3];
            String currLocation = split.length > 4 ? split[4] : "N/A";

            flight.add(new FlightData(flightId, currAltitude, destinationAirportCode, deptTime, currLocation));
        }

        // Removing duplicate elements and saving to this map
        TreeMap<String, TreeMap<String, FlightData>> map = new TreeMap<>();

        for (FlightData flightData : flight) {
            TreeMap<String, FlightData> flights = map.getOrDefault(flightData.getDestinationAirportCode(),
                    new TreeMap<>());
            flights.put(flightData.getDeptTime(), flightData);
            map.put(flightData.getDestinationAirportCode(), flights);
        }


        // Sorting currAltitude and saving to this list from map
        ArrayList<ArrayList<Map.Entry<String, FlightData>>> tail = new ArrayList<>();

        // Counting file in each main file and saving to this arrayList
        ArrayList<Object> count = new ArrayList<>();

        ArrayList<Map.Entry<String, FlightData>> entries;
        for (TreeMap<String, FlightData> flights : map.values()) {
            entries = new ArrayList<>(flights.entrySet());
            entries.sort(((o1, o2) ->
                    o1.getValue().currAltitude < o2.getValue().currAltitude ? -1 :
                            o1.getValue().currAltitude > o2.getValue().currAltitude ? 1 : 0
            ));
            tail.add(entries);
            count.add(entries.size());
        }


        // Saving the key in this arrayList
        ArrayList<String> head = new ArrayList<>();

        Set<String> s = map.keySet();
        for (String o : s) {
            head.add(o);
        }

        // saving the final output in this map
        HashMap<String, ArrayList<Map.Entry<String, FlightData>>> finalSorted = new HashMap<>();

        System.out.println("Total file " + head.size());

        for (int i = 0; i < head.size(); i++) {
            for (int j = 0; j < tail.size(); j++) {

                if (i == j) {
                    finalSorted.put(head.get(i), tail.get(j));

                    try {
                        String variable = head.get(i);
                        System.out.println(variable +" -> " + count.get(i));

                        PrintWriter p = new PrintWriter("C:\\Users\\hp\\IdeaProjects\\eSewa_Intern\\src\\week_3" +
                                "\\assignment\\allFiles\\ " + variable + ".csv");
                        p.println(tail.get(j));

                        p.flush();
                        p.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

            }
        }
        br.close();
    }
}
