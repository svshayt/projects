package book.util;

import java.io.PrintStream;

// Print methods based by System.out.print*
public class Print {

    // Print with a newline:
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // Print a newline
    public static void print() {
        System.out.println();
    }

    // Print with no line break
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    // Print with format
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
