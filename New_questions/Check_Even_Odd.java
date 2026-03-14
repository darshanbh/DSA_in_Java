package New_questions;

import java.util.Scanner;
import java.util.*;
public class Check_Even_Odd {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result;

        if(n%2!=0){
            int power=(n-1)/2;
            result=(int)Math.pow(2,power);
        }
        else{
            int power =(n/2)-1;
            result=(int)Math.pow(3,power);
        }
        System.out.println(result);
        
      


    }
    
}
