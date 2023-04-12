package using_the_case;

public class ConvertingANumberFromOneBaseToAnother {
    public static void main(String[] args) {
        int number = 17;
        // radix - основание системы счисления
        System.out.println(Integer.toString(number, 2));

        System.out.println(Integer.toString(number, 16));
    }

    public static String convertNumberToNewBase(String number, int base, int newBase){
        return Integer.toString(Integer.parseInt(number, base), newBase);
    }

    public static String convertFromDecimalToBaseX(int num, int newBase) throws IllegalArgumentException {
        if ((newBase < 2 || newBase > 10) && newBase != 16) {
            throw new IllegalArgumentException("New base must be from 2 - 10 or 16");
        }
        StringBuilder result = new StringBuilder();
        int remainder;
        while (num > 0) {
            remainder = num % newBase;
            if (newBase == 16) {
                if (remainder == 10) {
                    result.append('A');
                } else if (remainder == 11) {
                    result.append('B');
                } else if (remainder == 12) {
                    result.append('C');
                } else if (remainder == 13) {
                    result.append('D');
                } else if (remainder == 14) {
                    result.append('E');
                } else if (remainder == 15) {
                    result.append('F');
                } else {
                    result.append(remainder);
                }
            } else {
                result.append(remainder);
            }
            num /= newBase;
        }
        return new StringBuffer(result.toString()).reverse().toString();
    }

    public static int convertFromAnyBaseToDecimal(String num, int base) {
        if (base < 2 || (base > 10 && base != 16)) {
            return -1;
        }
        int val = 0;
        int power = 1;
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = charToDecimal(num.charAt(i));
            if (digit < 0 || digit >= base) {
                return -1;
            }
            val += digit * power;
            power = power * base;
        }
        return val;
    }
    public static int charToDecimal(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else {
            return c - 'A' + 10;
        }
    }

    public static String convertNumberToNewBaseCustom(String num, int base, int newBase) {
        int decimalNumber = convertFromAnyBaseToDecimal(num, base);
        String targetBase = "";
        try {
            targetBase = convertFromDecimalToBaseX(decimalNumber, newBase);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return  targetBase;
    }
}
