package parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexString {
    public static void main(String[] args) {
        String dep = "SSS";
        Matcher matcher = Pattern.compile("^([a-zA-Zа-яА-ЯёË]+)\\/([0-9]+)$").matcher(dep);
//        System.out.println(Pattern.compile("^([a-zA-Zа-яА-ЯёË]+)\\/([0-9]+)$", ).matcher(dep).group());
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        } else {
            System.out.println("!!! " + dep);
        }
    }
}
