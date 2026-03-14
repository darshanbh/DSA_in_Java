package New_questions;

import java.util.*;

public class Chocolate_Distribution {
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;

        for(int i=0;i<=n-m;i++){
            int diff=arr[i+m-1]-arr[i];
            mindiff=Math.min(mindiff,diff);
        }
        System.out.println(mindiff);


    }
}
