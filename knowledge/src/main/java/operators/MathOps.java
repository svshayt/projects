package operators;

import java.util.Random;

public class MathOps {

    public static void main(String[] args) {
        Random random = new Random(47);

        // Тесты для целых чисел
        int i, j, k;
        j = random.nextInt(100) + 1; // 59
        System.out.println("j : " + j);
        k = random.nextInt(100) + 1; // 56
        System.out.println("k : " + k);
        i = j + k; // 115
        System.out.println("j + k : " + i);
        i = j - k; // 3
        System.out.println("j - k : " + i);
        i = k / j; // 0
        System.out.println("k / j : " + i);
        i = k * j; // 3304
        System.out.println("k * j : " + i);
        i = k % j; // 56
        System.out.println("k % j : " + i);
        j %= k; // 3
        System.out.println("j %= k : " + j);

        // Тесты для вещественных чисел
        float u,v,w; // также можно использовать double
        v = random.nextFloat(); // 0.5309454
        System.out.println("v : " + v);
        w = random.nextFloat(); // 0.0534122
        System.out.println("w : " + w);
        u = v + w; // 0.5843576
        System.out.println("v + w : " + u);
        u = v - w; // 0.47753322
        System.out.println("v - w : " + u);
        u = v * w; // 0.028358962
        System.out.println("v * w : " + u);
        u = v / w; // 9.940527
        System.out.println("v / w : " + u);

        // следующее также относится к типам
        // char, byte, short, int, long и double
        u += v; // 10.471473
        System.out.println("u += v " + u);
        u -= v; // 9.940527
        System.out.println("u -= v " + u);
        u *= v; // 5.2778773
        System.out.println("u *= v " + u);
        u /= v; // 9.940527
        System.out.println("u /= v " + u);

        int a = 8;
        int b = -a;
        System.out.println(b * 5);
    }
}
