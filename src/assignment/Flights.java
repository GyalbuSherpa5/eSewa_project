package assignment;

public class Flights implements Comparable<Flights> {


    String flight_id;
    int curr_altitude_fit;
    String destination_airpot_code;
    String dept_time;
    String curr_location;


    public Flights(String flight_id, int curr_altitude_fit, String destination_airpot_code, String dept_time, String curr_location) {
        this.flight_id = flight_id;
        this.curr_altitude_fit = curr_altitude_fit;
        this.destination_airpot_code = destination_airpot_code;
        this.dept_time = dept_time;
        this.curr_location = curr_location;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public int getCurr_altitude_fit() {
        return curr_altitude_fit;
    }

    public void setCurr_altitude_fit(int curr_altitude_fit) {
        this.curr_altitude_fit = curr_altitude_fit;
    }

    public String getDestination_airpot_code() {
        return destination_airpot_code;
    }

    public void setDestination_airpot_code(String destination_airpot_code) {
        this.destination_airpot_code = destination_airpot_code;
    }

    public String getDept_time() {
        return dept_time;
    }

    public void setDept_time(String dept_time) {
        this.dept_time = dept_time;
    }

    public String getCurr_location() {
        return curr_location;
    }

    public void setCurr_location(String curr_location) {
        this.curr_location = curr_location;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flight_id='" + flight_id + '\'' +
                ", curr_altitude_fit='" + curr_altitude_fit + '\'' +
                ", destination_airpot_code='" + destination_airpot_code + '\'' +
                ", dept_time='" + dept_time + '\'' +
                ", curr_location='" + curr_location + '\'' +
                '}';
    }

    @Override
    public int compareTo(Flights o) {
        if(curr_altitude_fit< o.curr_altitude_fit){

            return -1;
        }
        else if(curr_altitude_fit> o.curr_altitude_fit){
            return 1;
        }
        else{
            return 0;
        }

    }
}
