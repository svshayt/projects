package com.svshayt.problemset.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author svshayt
 */
public class Id1ATheatreSquare {

    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {

        out.println(solve());

        out.flush();
        out.close();
    }

    public static long solve() {
        int n = inputInt();
        int m = inputInt();
        int a = inputInt();

        int na = (n % a == 0) ? (n / a) : (n / a + 1);
        int ma = (m % a == 0) ? (m / a) : (m / a + 1);
        return (long) na * ma;
    }

    static int inputInt() {
        return in.nextInt();
    }

    static int[] inputIntArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inputInt();
        }
        return arr;
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}