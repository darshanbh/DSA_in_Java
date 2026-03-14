package New_questions;
import java.util.*;
public class Shoes_paris {
    
    public static void main(String[] args){
        String[] shoes={"7L","7R","7L","8L","6R","7R","8R","6R"};

        HashMap<Integer,Integer> leftCount=new HashMap<>();
         HashMap<Integer,Integer> rightCount=new HashMap<>();
        
         for(String s:shoes){
            int size=Integer.parseInt(s.substring(0,s.length()-1));
            int side=s.charAt(s.length()-1);

            if(side=='L'){
                leftCount.put(size,leftCount.getOrDefault(size,0)+1);
            }
            rightCount.put(size,rightCount.getOrDefault(size,0)+1);
         }
         int pairs=0;

         for(int size: leftCount.keySet()){
            int left=leftCount.getOrDefault(size,0);
            int right=rightCount.getOrDefault(size,0);

            pairs=pairs+Math.min(left,right);
         }
         System.out.println(pairs);

        }
}
