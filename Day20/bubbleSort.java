import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        // Write Your Code Here
        bubbleSort(a);

    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    static void bubbleSort(int[] a) {
        int swap = 0;
        for(int x=0;x<a.length;x++){
           int numberOfSwaps = 0;
           for(int y=0;y<a.length-x-1;y++){
              if(a[y]>a[y+1]){
                 swap(a,y,y+1);
                 swap++;
              }
              numberOfSwaps++;
           }
           if(numberOfSwaps==0){
               break;
           }
        }
        System.out.println("Array is sorted in"+" "+ swap + " " +"swaps.");
        System.out.println("First Element:"+" "+a[0]);
        System.out.println("Last Element:"+" "+a[a.length-1]);
        //System.out.println(Arrays.toString(a));
    }
    
}