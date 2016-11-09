import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class BookReturnDate{
    public int day;
    public int month; 
    public int year;
    
    BookReturnDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookReturnDate actual = new BookReturnDate(scan.nextInt(), scan.nextInt(),scan.nextInt());
        BookReturnDate expected = new BookReturnDate(scan.nextInt(), scan.nextInt(),scan.nextInt());
        scan.close();
        
        int fine = 0;
        
        // Returned within the current year:
        if(expected.year == actual.year){
            // Returned 1+ months late in current year
            if(expected.month < actual.month){
                fine = (actual.month - expected.month) * 500;
            }
            // Returned 1+ days late within the current month
            else if( (expected.month == actual.month) 
                    && (expected.day < actual.day) ){
                fine = (actual.day - expected.day) * 15;
            }
            // Else it is implied that the book was returned early
        }
        else if(expected.year < actual.year){
            // Returned 1+ years late
            fine = 10000;
        }
        // Else it is implied that the book was returned 1+ years early

        System.out.println(fine);
        
    
    }
}
