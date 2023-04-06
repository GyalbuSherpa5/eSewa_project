package multithreading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Child Thread");
        }
    }


    public static void main(String[] args) {

        //Getting the name of the main thread
        System.out.println(Thread.currentThread().getName());
        //We must cread thread from the Thread class after implementing the Runnable interface to use the start method which is define in Thread Class.
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        //Getting the thread name which is by default thread-0
        System.out.println(t.getName());
        //Setting the name of the thread.
        t.setName("Child-Thread");
        System.out.println(t.getName());
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
