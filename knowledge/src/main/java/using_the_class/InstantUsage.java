package using_the_class;

import java.time.Instant;

public class InstantUsage {
    public static void main(String[] args) {
        // create two instance objects
        Instant instant1 = Instant.parse("2018-10-20T16:55:30.00Z");

        Instant instant2 = Instant.parse("2017-10-20T16:55:30.00Z");

        // print Instant Values
        System.out.println("Instant1: "
                + instant1);
        System.out.println("Instant2: "
                + instant2);

        // compare both instant
        int value = instant1.compareTo(instant2);

        if (value > 0)
            System.out.println("Instant1 is greater");
        else if (value == 0)
            System.out.println("Instant1 is equal to Instant2");
        else
            System.out.println("Instant2 is greater");
    }
}
