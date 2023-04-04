package usage;

public class NumberOfDigitsInAnInteger {
    public static void main(String[] args) {
        int nInt = 123456789;
        Integer nInteger = 123456789;

        System.out.println(String.valueOf(nInt).length());
        System.out.println(nInteger.toString().length());

        System.out.println(lengthString(nInt));
        System.out.println(lengthString(nInteger));

        System.out.println(lengthLogarithmicApproach(nInt));
        System.out.println(lengthLogarithmicApproach(nInteger));

        System.out.println(lengthRepeatedMultiplication(nInt));
        System.out.println(lengthRepeatedMultiplication(nInteger));

        System.out.println(lengthDividingWithPowersOfTwo(nInt));
        System.out.println(lengthDividingWithPowersOfTwo(nInteger));

        System.out.println(lengthDivideAndConquer(nInt));
        System.out.println(lengthDivideAndConquer(nInteger));
    }

    public static int lengthString(int n) {
        int length = 0;
        while (n > 0) {
            n /= 10;
            length++;
        }
        return length;
    }

    public static int lengthLogarithmicApproach(int n) {
        return (int) (Math.log10(n) + 1);
    }

    public static int lengthRepeatedMultiplication(int n) {
        int length = 0;
        long temp = 1;
        while (temp <= n) {
            length++;
            temp *= 10;
        }
        return length;

        //temp *= 10 is the same as writing temp = (temp << 3) + (temp << 1).
    }

    public static int lengthDividingWithPowersOfTwo(int n) {
        int length = 1;
        if (n >= 100000000) {
            length += 8;
            n /= 100000000;
        }
        if (n >= 10000) {
            length += 4;
            n /= 10000;
        }
        if (n >= 100) {
            length += 2;
            n /= 100;
        }
        if (n >= 10) {
            length += 1;
        }
        return length;
    }

    public static int lengthDivideAndConquer(int n) {
        if (n < 100000) {
            if (n < 100) {
                if (n < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (n < 1000) {
                    return 3;
                } else {
                    if (n < 10000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        } else {
            if (n < 10000000) {
                if (n < 1000000) {
                    return 6;
                } else {
                    return 7;
                }
            } else {
                if (n < 100000000) {
                    return 8;
                } else {
                    if (n < 1000000000) {
                        return 9;
                    } else {
                        return 10;
                    }
                }
            }
        }
    }


}
