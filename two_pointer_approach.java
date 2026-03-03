import java.util.*;

// input array is sorted and to find sumof 2 number where they given the target has to match

public class two_pointer_approach {

    static int[] twoSum(int[] arr,int target){

        int l=0;
        int r=arr.length-1;

        while(l< r){
            int sum=arr[l]+arr[r];

            if(sum==target){

                return new int[]{l + 1,r + 1};
            }
            else if(sum < target){
                l++;
            }
            else{
                r--;
            }

        }

        return new int[]{-1,-1};

    }


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int  i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("Enteer the target number: ");
        int target=sc.nextInt();

        int[] result=twoSum(arr,target);

        System.out.println("first index : "+ result[0]+"second index:"+result[1]);



    


}




    
}


