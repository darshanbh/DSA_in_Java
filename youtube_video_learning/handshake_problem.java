package youtube_video_learning;

import java.util.*;
public class handshake_problem {


    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of TEst cases");
      int T=sc.nextInt();
      while(T >0){
        System.out.println("Enter no of PEOPLE");
        int n=sc.nextInt();
        int handshakes_result=(n*(n-1)/2);
        System.out.println(handshakes_result);

        T--;
      }

    }
}
    

