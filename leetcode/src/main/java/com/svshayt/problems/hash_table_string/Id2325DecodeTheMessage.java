package com.svshayt.problems.hash_table_string;

import java.util.HashMap;

public class Id2325DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        var sb = new StringBuilder();
        char[] keyToAlphabet = new char[128];
        keyToAlphabet[' '] = ' ';
        char currChar = 'a';

        for (char c : key.toCharArray())
            if (keyToAlphabet[c] == 0)
                keyToAlphabet[c] = currChar++;

        for (char c : message.toCharArray())
            sb.append(keyToAlphabet[c]);

        return sb.toString();
    }

    public String decodeMessage2(String key, String message) {
        var keyToAlphabet = new HashMap<Character, Character>();
        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (Character.isLetter(c) && !keyToAlphabet.containsKey(c)) {
                char cNext = (char) ('a' + count);
                count++;
                keyToAlphabet.put(c, cNext);
            }

        }

        var sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(keyToAlphabet.get(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Character.isLetter(' '));
        var obj = new Id2325DecodeTheMessage();
        var res = obj.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
        System.out.println(res);
    }
}
