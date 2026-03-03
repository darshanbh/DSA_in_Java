import java.util.*;
public class Equaiibrix {

    // to find index whicxh is equal to sum of left and sum of right side  of the array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int list[]=new int[n];

        for(int i=0;i<n;i++){
           list[i]=sc.nextInt();
        }
// total sum of the array
        int ts=0;
        for(int i=0;i<n;i++){
            ts=ts+list[i];
        }

        int ls=0;
        int rt=0;
        for(int i=0;i<n;i++){
            rt=ts-ls-list[i];
            if(rt==ls){
                System.out.println(i);
                return;
                
            }
            ls=ls+list[i];
        }

        System.out.println(-1);



    }
    
}
