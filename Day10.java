import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int max = 0;
        int temp = 0;
        while(n != 0){
            int carry = n % 2;
            if (carry == 1){
                temp ++;
            }
            else{
                if (max < temp){
                    max = temp;
                }
                temp = 0;
            }
            n = (n - carry) /2;
        }
        if (temp > max){
            max = temp;
        }
        System.out.println(max);
    }
}


