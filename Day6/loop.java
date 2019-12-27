import java.io.*;
import java.util.*;

public class Solution {
  
    public static final Scanner scanner = new Scanner(System.in);

    public static void print(String s){
        StringBuffer sb_even = new StringBuffer();
        StringBuffer sb_odd = new StringBuffer();

        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb_even.append(s.charAt(i));
            }else {
                sb_odd.append(s.charAt(i));
            }
        }
        System.out.println(sb_even.toString()+" "+sb_odd.toString());
        
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        String[] res = new String[n];
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=0;i<n;i++){
            res[i]=scanner.nextLine();
        }
        scanner.close();
        for(int i=0;i<n;i++){
            print(res[i]);
        }
    }
}

