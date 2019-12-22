import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        int g = 0;
        double e = 0.0;
        String S = "";
        g = scan.nextInt();
        if(scan.hasNext()){
            e = scan.nextDouble();
        }
        scan.nextLine();
        if(scan.hasNext()){
            S = scan.nextLine();
        }
        System.out.println(i+g);   
        System.out.printf("%.1f",d+e);
        System.out.println();
        System.out.println(s+""+S);
        scan.close();