import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int recursion(int j){
        if (j <= 1){
            return 1;
        }
        return j * recursion(j - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        System.out.println(recursion(i));
    }
}
