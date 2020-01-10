import java.io.*;
import java.util.*;

class Solution {

    public static void isPrime(int a) {
        boolean prime = true;
        if(a==1){
            prime = false;
        }
        if (a == 2 || a == 3) {
            prime = true;
        } else {
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if(prime) {
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }

    public static void main(String[] args) throws IOException {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(br.readLine());
        }
        for (int x : res) {
            isPrime(x);
        }
    }
}

