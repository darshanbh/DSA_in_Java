import java.util.*;
import java.util.Map;

// to print non-repating charter of only first occurence
public class non_repeatingnum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();

     HashMap<Character,Integer> map=new HashMap<>();
     for(char ch:str.toCharArray()){
        map.put(ch, map.getOrDefault(ch,0)+1);
        
    }
    for(char ch :str.toCharArray()){
        if(map.get(ch)==1){
            System.out.println(ch);
            return;
        }
    }
    System.out.println(-1);

    }
}