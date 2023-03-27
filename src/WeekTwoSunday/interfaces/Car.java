package WeekTwoSunday.interfaces;

public class Car implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void start() {
        System.out.println("cAN BE STARTED");

    }

    @Override
    public void stop() {
        System.out.println("Can be stopped");

    }

    @Override
    public void acc() {
        System.out.println("cAN BE ACC");

    }

    public static void main(String args[]){
        Car cars=new Car();
        cars.acc();
        cars.brake();
        cars.stop();



    }
}
