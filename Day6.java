import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testNum = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < testNum; i ++){
            String input = scan.nextLine();
            int size = input.length();
            String even = "";
            String odd = "";
            for (int j = 0; j < size; j ++){
                if (j % 2 == 0){
                    even += input.charAt(j);
                }
                else {
                    odd += input.charAt(j);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
