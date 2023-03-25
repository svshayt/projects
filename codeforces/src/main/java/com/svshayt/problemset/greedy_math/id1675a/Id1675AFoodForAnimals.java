package com.svshayt.problemset.greedy_math.id1675a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Math.max;

/**
 * @author svshayt
 */
public class Id1675AFoodForAnimals {

    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {

        int t = inputInt();
        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    public static void solve() {
        int[] arr = inputIntArray(5);

        int ax = max(0, arr[3] - arr[0]);
        int by = max(0, arr[4] - arr[1]);

        if (arr[2] >= ax + by) {
            out.println("YES");
        } else {
            out.println("NO");
        }
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