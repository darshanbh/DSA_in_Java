package New_questions;
import java.util.*;
public class Max_num_negative {
    static int maxnum(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);

        int option1=arr[n-1]*arr[n-2]*arr[n-3];
        int option2=arr[0]*arr[n]*arr[n-1];

        return Math.max(option1,option2);


    }
    public static void main(String[] args){
        int[] arr={-1,-2,4,5,2};

        System.out.println(maxnum(arr));

        
    }
}
