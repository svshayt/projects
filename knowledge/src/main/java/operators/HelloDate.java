package operators;

import me.svshayt.util.Print;

import java.util.Date;

import static me.svshayt.util.Print.print;

public class HelloDate {
    public static void main(String[] args) {
        Print.print("Привет, сегодня: ");
        Print.print(new Date());
    }
}
