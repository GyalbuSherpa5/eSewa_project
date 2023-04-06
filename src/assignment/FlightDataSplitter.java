package assignment;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FlightDataSplitter {


    static SortedMap<String, ArrayList<Flights>> map = new TreeMap<>();
    static List<Flights> flights = new ArrayList<>();

    public static void main(String... args) throws IOException {


        flights = readFligthsFromCSV("C:\\Users\\dipes\\Desktop\\flights.csv");

        // Using Executor Service tot create fixed Thread Pool
        ExecutorService executor = Executors.newFixedThreadPool(200);
        //For ensuring that threads do not repeat the same task.
        Set<Runnable> executedTasks = Collections.synchronizedSet(new HashSet<>());
        Runnable worker = null;
        for (int i = 0; i < 10; i++) {
            worker = createTask(i);
            Future<?> future = executor.submit(worker);


// calling execute method of ExecutorService

            if (!executedTasks.contains(future)) {
                executedTasks.add((Runnable) future);
            }
        }
        executor.execute(worker);
//
//
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println(System.currentTimeMillis());

        System.out.println("Finished all threads");

    }

    static Runnable createTask(int taskId) {
        return () -> {


            groupByDestination(flights);
            try {
                writeInCsv(map);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        };
    }

    static List<Flights> readFligthsFromCSV(String fileName) {
        int count = 0;

        List<Flights> flights = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {


            String line = br.readLine();
            //To skip first row and read with second row to skip column name reading.
            if (line != null) {
                while ((line = br.readLine()) != null) {
                    String[] attributes = line.split(",");
                    Flights flight = createFlight(attributes);
                    flights.add(flight);


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();

            } catch (IOException ie) {
                System.out.println("Error occured while closing the BR.");
                ie.printStackTrace();
            }
        }

        return flights;

    }

    public static Flights createFlight(String[] metadata) {
        int curr_altitude_fit = 0;
        String flight_id = metadata[0];
        try {
            //checking whether the data is empty if empty assigned 0 then typecaste to long.
            curr_altitude_fit = metadata[1].isEmpty() ? 0 : Integer.parseInt(metadata[1]);
        } catch (NumberFormatException nfe) {

            System.out.println("NumberFormat Exception: invalid input string");
        }

        String destination_airpot_code = metadata[2];
        String dept_time = metadata[3];
        String curr_location = metadata.length > 4 ? metadata[3] : "N/A";


        return new Flights(flight_id, curr_altitude_fit, destination_airpot_code, dept_time, curr_location);

    }

    static void groupByDestination(List<Flights> flights) {

        int count = 0;
        for (Flights flight : flights) {
            boolean flag = true;
            //checking the value of the key contain or not and adding new value in same key to group by destination airpot code.
            if (map.containsKey(flight.getDestination_airpot_code())) {


//                //accessing the value of the key from hashmap
                ArrayList<Flights> valueOfMap = map.get(flight.getDestination_airpot_code());
//                if(flight.getDept_time().equals(map.get(flight.getDept_time()))) {
//                }
//


                //For traversing the value of the map
                for (Flights obj : valueOfMap) {
                    //if current object is equal to deparature time of the object break the loop.
                    if (flight.getDept_time().equals(obj.getDept_time())) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    valueOfMap.add(flight);
                    Collections.sort(valueOfMap);
                    map.put(flight.getDestination_airpot_code(), valueOfMap);
                }


            } else {
                ArrayList<Flights> list = new ArrayList<>();
                list.add(flight);
                Collections.sort(list);
                map.put(flight.getDestination_airpot_code(), list);
            }
        }

        Set set = map.entrySet();

        Iterator<HashSet> itr = set.iterator();

        while (itr.hasNext()) {
            count += 1;
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        System.out.println(count);

    }

    public static void writeInCsv(SortedMap<String, ArrayList<Flights>> map) throws IOException {
        PrintWriter pw = null;


        for (Map.Entry<String, ArrayList<Flights>> entry : map.entrySet()) {
            String key = entry.getKey();
            ArrayList<Flights> value = entry.getValue();

            try {
                //Creating the equivalent key csv file
                File f = new File(key + ".csv");

                //create csv file
//                f.createNewFile();
                pw = new PrintWriter(f);
                for (Flights a : value) {
                    //for writing the content in to c.s.v file
                    pw.println(a);

                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                pw.flush();
                pw.close();


            }


        }


    }


}













