package youtube_video_learning;

import java.util.*;

public class socks_freq_counting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Map<Integer,Integer> freq=new HashMap<>();

        // int[] freq=new int[101];

        // for(int i=0;i<N;i++){
        //     int color=sc.nextInt();
        //     freq[color]++;
        // }
        // int totalPairs=0;

        // for(int i=0;i<101;i++){
        //     totalPairs+=freq[i]/2;
        // }
        // System.out.println(totalPairs);
         for(int i = 0; i < N; i++){
            int color = sc.nextInt();

            if(freq.containsKey(color)) {
                freq.put(color, freq.get(color) + 1);
            } else {
                freq.put(color,1);
            }
        }
        int totalPairs=0;
        for(int count:freq.values()){
            totalPairs+=count/2;
        }
        System.out.println(totalPairs);
    }
}
