package New_questions;

import java.util.Scanner;

public class Max_Min_digitinnum {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min_digit=9;
        int max_digit=0;

        while(n>0){
            int digit=n%10;
            min_digit=Math.min(min_digit,digit);
            max_digit=Math.max(max_digit,digit);
            n=n/10;

        }
        System.out.println(min_digit + " " + max_digit);
    }
}
