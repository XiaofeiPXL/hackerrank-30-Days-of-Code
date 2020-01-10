import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void bitWiseAnd(int n, int k) {
        int[] set = new int[n];
        for (int i = 0; i < n; i++) {
            set[i] = i+1;
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int m = i + 1; m < n; m++) {
                if ((set[i] & set[m]) < k) {
                    temp = Math.max(set[i] & set[m], temp);
                }
            }
        }
        System.out.println(temp);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            bitWiseAnd(n, k);
        }
        scanner.close();
    }
}
