package using_the_class;

public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("asdflasdf-adfjewet.xlsx");
        s.insert(s.length() - 5, "_22");
        System.out.println(s);
    }
}
