package youtube_video_learning;
import java.util.*;

public class find_single_element{
    public static void main(String[] args){
        int nums[]={4,2,1,2};
        int n=nums.length;
        int res=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<n;i++){
            if(map.get(nums[i])==1){
                res=nums[i];
                break;
            }
        }
        System.out.println(res);
    }
}