package WeektwoMonday.Enumexample;

public class Basic {
    enum Week implements  Hello {
        Sun, Mon, Tue, Wed, Thur, Fri, Sat;

        //these are enum constant
        //these are public static and finla
        //so its child cant be created
        //type is Week
        Week(){
            System.out.println("constructor called"+ this);
        }

        @Override
        public void hello() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Sat;
        System.out.println(week);
        System.out.println(week.ordinal());
    }
}
