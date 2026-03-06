package youtube_video_learning;

import java.util.*;
public class count_candle_height {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int max=Integer.MIN_VALUE;
    int count=0;

    for(int i=0;i<N;i++){
        int height=sc.nextInt();
        if(height>max){
            max=height;
            count=1;
        }
        else if(height == max){
            count++;
        }
    }
    System.out.println(count);
    }
}
