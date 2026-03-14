package New_questions;
import java.util.*;

public class Multiple_ofTen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> nonMultiples=new ArrayList<>();
        List<Integer> Multiples=new ArrayList<>();

        for(int num:arr){
            if(num%10==0){
                Multiples.add(num);
            }
            else{
                nonMultiples.add(num);
            }
        }
        int index=0;
        for(int num:nonMultiples){
            arr[index++]=num;
        }
        for(int num:Multiples){
            arr[index++]=num;
        }
        System.out.println(Arrays.toString(arr));

    }
}
