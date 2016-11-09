import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=0; i < a; i++){
            int n=s.nextInt();
            boolean b=checkPrime(n);
            if(b){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }

    public static boolean checkPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}


