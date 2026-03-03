import java.util.*;

class Even_frequency_count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }

        }
        // print elements of even freq

        for(HashMap.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()%2==0){
                System.out.print(entry.getKey()+" ");
            }
            
        }


    }
}