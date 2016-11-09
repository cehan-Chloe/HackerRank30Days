import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int[] array;
    // the bubble sort function
    private static void bubbleSort() {
        int len = array.length;
       
        // number of swaps for all array iterations
        int totalSwaps = 0; 
        for (int j = 0; j < len; j ++){
            int curSwaps = 0;
            for (int i = 0; i < len - 1; i ++){
                if (array[i] > array[i + 1]){
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    totalSwaps ++;
                    curSwaps++;
                }
            }
            if (curSwaps == 0) {
                System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
                System.out.printf("First Element: %d\n", array[0]);
                System.out.printf("Last Element: %d\n", array[len - 1]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        array = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            array[a_i] = in.nextInt();
        }
        in.close();
        bubbleSort();
    }
}


