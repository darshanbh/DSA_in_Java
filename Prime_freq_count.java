import java.util.*;

public class Prime_freq_count {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        // print all num whihc has prime frequnecy

        for(HashMap.Entry<Integer,Integer> entry:mp.entrySet()){
            if(isPrime(entry.getValue())){
                System.out.print(entry.getKey()+ " ");
            }
        }

    }

}
