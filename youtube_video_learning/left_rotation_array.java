package youtube_video_learning;

import java.util.Scanner;

public class left_rotation_array {

    // static int[] left_rotate(int[] arr){

    // }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        int D=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        D=D%N;
        // print rotated array
        for(int i=D;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<D;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
