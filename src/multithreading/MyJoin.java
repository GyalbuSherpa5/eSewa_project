package multithreading;

public class MyJoin implements  Runnable{

    @Override
    public void run() {
        try{
          for( int i=0;i<3;i++) {
              System.out.println("Thread Name " + Thread.currentThread().getName());
              Thread.sleep(5000);
          }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){

        MyJoin m1=new MyJoin();
        MyJoin m2=new MyJoin();
        MyJoin m3=new MyJoin();

        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        Thread t3=new Thread(m3);

        //Starting the thread 1.
        t1.start();
        try{
            System.out.println("Thread Name "+ Thread.currentThread().getName());
            //Ensure the execution of the current thread is done and then another thread is executed.
            t1.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //Starting the Thread 2.
        t2.start();
        try{
            System.out.println("Thread Name "+Thread.currentThread().getName());
            //Ensure the execution of the current thread is done and then another thread is executed.
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception at Thread 2");
        }
        //Starting the thread 3.
        t3.start();

    }
}
