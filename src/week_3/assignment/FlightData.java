package week_3.assignment;

public class FlightData implements Runnable{
    String flightId;
    int currAltitude;
    String destinationAirportCode;
    String deptTime;
    String currLocation;

    public FlightData(String flightId, int currAltitude, String destinationAirportCode, String deptTime,
                      String currLocation) {
        this.flightId = flightId;
        this.currAltitude = currAltitude;
        this.destinationAirportCode = destinationAirportCode;
        this.deptTime = deptTime;
        this.currLocation = currLocation;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public String getDeptTime() {
        return deptTime;
    }

    public int getCurrAltitude() {
        return currAltitude;
    }

    @Override
    public String toString() {
        return
        flightId +
        ", " + currAltitude +
        ", " + destinationAirportCode +
        ", " + deptTime +
        ", " + currLocation + '\n';
    }

    @Override
    public void run() {
        long a = System.nanoTime();
        System.out.println(flightId+ ".. job started by Thread : " + Thread.currentThread().getName());
        long b = System.nanoTime();
        System.out.println(b-a);
    }
}
