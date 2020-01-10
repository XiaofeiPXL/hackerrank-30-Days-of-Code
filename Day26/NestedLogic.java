import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int actualDay = Integer.parseInt(info[0]);
        int actualMonth = Integer.parseInt(info[1]); 
        int actualYear = Integer.parseInt(info[2]); 
        
        String[] expect = br.readLine().split(" ");
        int expectDay = Integer.parseInt(expect[0]);
        int expectMonth = Integer.parseInt(expect[1]); 
        int expectYear = Integer.parseInt(expect[2]); 
        
        br.close();
        
        int fine = 0;
        if(actualDay<=expectDay & actualMonth==expectMonth & actualYear==expectYear){
            fine = 0;
        }else if(actualDay>expectDay & actualMonth==expectMonth & actualYear==expectYear) {
            fine = 15*(actualDay-expectDay);
        }else if(actualMonth>expectMonth & actualYear==expectYear) {
            fine = 500*(actualMonth-expectMonth);
        }else if(actualYear>expectYear) {
            fine = 10000;
        }
        

        System.out.println(fine);
    }
}

