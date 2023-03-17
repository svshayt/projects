package com.svshayt.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 1337. The K Weakest Rows in a Matrix
 * Easy
 * 3.1K
 * 187
 * Companies
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
 *
 * A row i is weaker than a row j if one of the following is true:
 *
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 *
 *
 *
 * Example 1:
 *
 * Input: mat =
 * [[1,1,0,0,0],
 *  [1,1,1,1,0],
 *  [1,0,0,0,0],
 *  [1,1,0,0,0],
 *  [1,1,1,1,1]],
 * k = 3
 * Output: [2,0,3]
 * Explanation:
 * The number of soldiers in each row is:
 * - Row 0: 2
 * - Row 1: 4
 * - Row 2: 1
 * - Row 3: 2
 * - Row 4: 5
 * The rows ordered from weakest to strongest are [2,0,3,1,4].
 * Example 2:
 *
 * Input: mat =
 * [[1,0,0,0],
 *  [1,1,1,1],
 *  [1,0,0,0],
 *  [1,0,0,0]],
 * k = 2
 * Output: [0,2]
 * Explanation:
 * The number of soldiers in each row is:
 * - Row 0: 1
 * - Row 1: 4
 * - Row 2: 1
 * - Row 3: 1
 * The rows ordered from weakest to strongest are [0,2,3,1].
 *
 *
 * Constraints:
 *
 * m == mat.length
 * n == mat[i].length
 * 2 <= n, m <= 100
 * 1 <= k <= m
 * matrix[i][j] is either 0 or 1.
 * Accepted
 * 236.3K
 * Submissions
 * 327.6K
 * Acceptance Rate
 * 72.1%
 * Seen this question in a real interview before?
 * 1/4
 * Yes
 * No
 * Discussion (10)
 * Related Topics
 * Array
 * Binary Search
 * Sorting
 * Heap (Priority Queue)
 * Matrix
 */
public class Id1337TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] weakestRows = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            weakestRows[i] = numOfSoldiers(mat[i]) * 1000 + i;
        }
        Arrays.sort(weakestRows);

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = weakestRows[i] % 1000;
        }
        return result;
    }

    public int numOfSoldiers(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (arr[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return left;
    }

    public int[] kWeakestRows2(int[][] mat, int k) { // slow
        List<Integer> lines = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            lines.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < mat[0].length; i++) {
            Iterator<Integer> it = lines.iterator();
            while(it.hasNext()) {
                int num = it.next();
                if (mat[num][i] == 0) {
                    result.add(num);
                    it.remove();
                }
                if (result.size() >= k) break;
            }
            if (result.size() >= k) break;
        }
        int n = 0;
        while (result.size() < k) {
            result.add(lines.get(n));
            n++;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }



    public static void main(String[] args) {
        int[][] mat = {{1, 0, 0, 0}, {1, 1, 1, 0}, {1, 1, 0, 0}};
        System.out.println(new Id1337TheKWeakestRowsInAMatrix().numOfSoldiers(new int[]{1, 1, 1, 1, 0, 0, 0}));
        System.out.println(Arrays.toString(new Id1337TheKWeakestRowsInAMatrix().kWeakestRows(mat, 2)));
    }
}
