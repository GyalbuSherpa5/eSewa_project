package week_2.java1point8;

import java.util.function.Consumer;

public class F8_Predefined_Consumer {
    /*

        Predicate<T> ----> boolean (test)
        Function<T,R> ----> R type (apply)
        Consumer<T> ----> void (accept)

        method is accept.

     */
    public static void main(String[] args) {
        Consumer<String> c = i-> System.out.println(i);
        c.accept("don");
    }
}
