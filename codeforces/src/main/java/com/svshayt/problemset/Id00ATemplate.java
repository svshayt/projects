package com.svshayt.problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author svshayt
 */
public class Id00ATemplate {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        while (t-- > 0) {

        }

        out.close();
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

    double nextDouble() {
        return Double.parseDouble(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    boolean hasNext() {
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (s == null) return false;
        st = new StringTokenizer(s);
        return true;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = (int) nextInt();
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    }
}