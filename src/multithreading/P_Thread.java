package multithreading;


//Using Thread class To implement Multithreading;
public class P_Thread extends Thread{

    //Execute By Child Thread
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

    //Execute By Main Thread
    public static void main(String[] args){

        P_Thread p1=new P_Thread();
        //Starting the thread
        p1.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }


    }
}
