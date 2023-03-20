package com.svshayt.problemset.id_4_codeforces_beta_round_4_div_2_only;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Math.max;

/**
 * @author svshayt
 */
public class Id4AWatermelon {

    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {

        out.println(solve());

        out.flush();
        out.close();
    }

    public static String solve() {
        int w = inputInt();

        if (w < 4) return "NO";
        if (w % 2 == 0) {
            return "YES";
        } else {
            return "NO";
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