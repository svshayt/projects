package book.operators;

public class BitwiseOperatorsExercise10 {

    public static void main(String[] args) {
        int a = 0x55;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        int b = 0xAA;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        int result1 = a & b;
        System.out.println(result1);
        System.out.println(Integer.toBinaryString(result1));
        int result2 = a | b;
        System.out.println(result2);
        System.out.println(Integer.toBinaryString(result2));
        int result3 = a ^ b;
        System.out.println(result3);
        System.out.println(Integer.toBinaryString(result3));
        int result4 = ~a;
        System.out.println(result4);
        System.out.println(Integer.toBinaryString(result4));
    }
}
