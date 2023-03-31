package book.operators;

public class Exponents {

    public static void main(String[] args) {
        float expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // Суффикс *d' не обязателен
        double expDouble2 = 47e47; // Автоматически определяется double
        System.out.println(expDouble);

        System.out.println(Float.MAX_VALUE); // 3.4028235E38
        System.out.println(Float.MIN_VALUE); // 1.4E-45
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println(Double.MIN_VALUE); // 4.9E-324
    }
}
