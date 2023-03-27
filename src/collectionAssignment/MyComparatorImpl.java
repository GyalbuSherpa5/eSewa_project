package collectionAssignment;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class MyComparatorImpl implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {


        if (o1.price > o2.price) {
            return 1;
        } else if (o1.price < o2.price) {
            return -1;
        }
        else{
            return 0;
        }
    }


    @Override
    public Comparator<Book> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Book> thenComparing(Comparator<? super Book> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Book> thenComparing(Function<? super Book, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Book> thenComparing(Function<? super Book, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Book> thenComparingInt(ToIntFunction<? super Book> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Book> thenComparingLong(ToLongFunction<? super Book> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Book> thenComparingDouble(ToDoubleFunction<? super Book> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
