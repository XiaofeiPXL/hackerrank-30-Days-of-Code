import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int consecutiveOne(int n){
       int count = 0;
       int max = 0;
       while(n>0){
          if(n%2==1){
             count++;
             max = Math.max(max,count);
          }else{
              count=0;
          }
          n = n>>1;
       }
       return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(consecutiveOne(n));
        scanner.close();
    }
}