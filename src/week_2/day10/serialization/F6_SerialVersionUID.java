package week_2.day10.serialization;

import java.io.Serializable;

class Hero implements Serializable {
    private static final long serialVersionUID = 1l;
    int i = 10;
    transient int j = 2;
}
public class F6_SerialVersionUID {

    /*
        In serialization both the sender and receiver need not be same person, need not use same machine, need not be
         from same location. The person maybe different, the machine maybe different and the location maybe different.

        In serialization both the sender and receiver should have .class at the beginning. Just the state of the
        object is travelling from sender to receiver.

        At the time of serialization, with every object sender side jvm will save a unique identifier. Jvm is
        responsible to generate this unique identifier based on .class file.

        At the time of deserialization, receiver side jvm will compare unique identifier associated with object with
        local class unique identifier, if both matches, then only deserialization will be performed, otherwise we'll
        get runtime exception saying invalidClassException.

        This unique identifier is not but SerialVersionUID.

        - Problems of depending on default serialVersionUID generated by JVM:
        1) Both sender and receiver should use same JVM wrt vendor, platform and version. Otherwise, receiver is
        unable to deserialize because of different serialVersionUIDs.
        2) Both the sender and receiver should use same .class file version, after serialization if there is any
        change in .class file at receiver side then, receiver is unable to deserialize.
        3) To generate serialVersionUID internally, jvm may use complex algorithm which may create performance problems.

        We can make our serialVersionUID by:
        private static final long serialVersionUID = 1l;

     */

    public static void main(String[] args) {

    }
}
