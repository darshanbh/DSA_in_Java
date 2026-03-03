import java.util.*;

public class first_last_occurrence_element {

    static int firstOccurrence(int[] number,int target){
        int low = 0;
        int high = number.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(number[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(number[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;   // 🔥 added
    }

    static int secondOccurrence(int[] number,int target){
        int low = 0;
        int high = number.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(number[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(number[mid] < target){
                low = mid + 1;   // 🔥 corrected
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int first = firstOccurrence(arr,target);
        int second = secondOccurrence(arr,target);

        System.out.println("first: "+first+"  second: "+ second);
    }
}