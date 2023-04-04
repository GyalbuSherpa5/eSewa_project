package week_3.assignment;

public class FlightData{
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

}
