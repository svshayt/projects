package com.svshayt.problems;

public class Id1108DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public String defangIPaddr2(String address) {
        StringBuilder str = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                str.append("[.]");
            } else str.append(ch);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Id1108DefangingAnIPAddress().defangIPaddr("1.1.1.1"));
    }
}
