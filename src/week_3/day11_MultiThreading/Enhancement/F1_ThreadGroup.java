package week_3.day11_MultiThreading.Enhancement;

public class F1_ThreadGroup {
    /*
        Based on functionality we can group threads into a single unit, which is nothing but thread group, i.e.
        thread group contains a group of threads.
        In addition to threads, thread group can also contain sub-thread groups.

        The main advantage of maintaining threads in the form of thread group is we can perform common operations
        very easily.

     */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}
