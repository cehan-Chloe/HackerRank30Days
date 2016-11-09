import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int findMaximum(int n, int k){
        int max = 0;
        int a = n - 1;
        while(a-- > 0) {
            for(int b = a + 1; b <= n; b++){
                int test = a & b;
                if(test < k && test > max){
                    max = test;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(findMaximum(n, k));
        }
        in.close();
    }
}


