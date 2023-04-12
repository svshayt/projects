package using_the_case;

import com.google.common.math.BigIntegerMath;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class CalculateFactorial {
    public static void main(String[] args) {
        var calculateFactorial = new CalculateFactorial();
        System.out.println(calculateFactorial.factorialUsingForLoop(5));
        System.out.println(calculateFactorial.factorialUsingStreams(5));
        System.out.println(calculateFactorial.factorialUsingRecursion(5));
        System.out.println(calculateFactorial.factorialUsingApacheCommons(5));
        System.out.println(calculateFactorial.factorialHavingLargeResult(5));
        System.out.println(calculateFactorial.factorialUsingGuava(5));
    }

    public long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    public long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    public long factorialUsingApacheCommons(int n) {
        return CombinatoricsUtils.factorial(n);
    }

    public BigInteger factorialHavingLargeResult(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public BigInteger factorialUsingGuava(int n) {
        return BigIntegerMath.factorial(n);
    }
}
