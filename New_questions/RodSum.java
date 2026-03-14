package New_questions;

import java.util.*;

public class RodSum {

    static int solve(int[] rods,int i,int sumA,int sumB){
        if(i==rods.length){
            if(sumA==sumB){
                return sumA;
            }
            else
            {
                return 0;
            }
        }
        // choice 1-> put rod in fence A
        int takeA=solve(rods,i+1,sumA+rods[i],sumB);
        int takeB=solve(rods,i+1,sumA,sumB+rods[i]);

        int skip=solve(rods,i+1,sumA,sumB);
        return Math.max(takeA,Math.max(takeB,skip));
    }
    public static void main(String[] args){
       int[] rods={1,2,3,4,5,6};
       int ans=solve(rods,0,0,0);
       System.out.println(ans);


    }
    
}
