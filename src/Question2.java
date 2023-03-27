public class Question2 {
    /*
2.
    a. What is collection framework? What is an Iterator in Java, and how is it used?
        The purpose of hasNext() and next()?
    b. What is the time complexity of adding, removing, and searching for an element in an Array, Linked List,
        Stack, and Queue?
    c. What is the List interface in Java, and what are some common implementations of it?
    d. What is the difference between a List and a Set in Java

########################################################################################################################
    -Collection represents a group of objects,known as its elements.
    -Collection framework is defined by a set of interfaces and associated contracts,
      and provides concrete implementations of interfaces for the most common data structure.
    -Iterator is an interface that acts as a doorkeeper for the collection object that it represents,providing access
     to the contents of the collection in a very specific manner.
    -It is used with its three methods
        a.hasNext()     //used to return ture if  the iterator has more elements to traverse else false
        b.next()        //used to return next element of the collection
        c.remove()
#######################################################################################################################
    For Best case
                    Array       LinkedList          Stack           Queue
    add              O(1)           O(1)             O(1)             O(1)
    remove           O(1)           O(1)             O(1)             O(1)
    search            O(1)           O(1)             O(1)             O(1)

For Worst case
                    Array       LinkedList          Stack           Queue
    add              O(1)           O(1)             O(1)             O(1)
    remove           O(n)           O(1)             O(1)             O(1)
    search            O(n)           O(n)             O(n)             O(n)

#######################################################################################################################
---->   List interface is the child interface of Collection interface which allows duplicate object and addition is
        done in insertion order.
        Common implementation are:
        a.ArrayList
            -Based on resizeable array or growable Array
            -Duplicate
            -insertion order
            -Heterogeneous Object
       b. Vector
            -Most of the methods are synchronized
            -Thread-safe
            -Performance is low as remaining thread has to wait
            -Underlying data structure is resizable array
            -duplicate allowed
            -insertion order

        c. LinkedList
             -Best choice for addition or deletion
            -The Worst choice for frequent retrieval
            -Underlying data structure is doubly linked list
            -insertion order is preserved
            -duplicates are allowed
            -Heterogeneous object are allowed

        d. Stack
             -LIFO
             -new Stack();
             push(Object O);
             pop();
             peek();
             empty();
             search(value); //returns offset from top of stack in what index it lies

#######################################################################################################################
        List                                                Set
a.  It allows duplicate elements	                 a. It doesn't allow duplicate elements
b. Insertion on the basis of insertion order	     b. Insertion on the basis of hash code of element
c. Have many methods except methods of collection    c. Don't have any methods except the method of collection interface
    framework like void add(int index,E element)
d. ArrayList, LinkedList,Vector,Stack implements     d. HashSet,LinkedHashSet,TreeSet implements Set
    List

     */
}
