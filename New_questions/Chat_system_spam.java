package New_questions;

import java.util.*;

//Brute force

public class Chat_system_spam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().strip();

        int count=1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                if(count>=3){
                    System.out.println("spam");
                    return;
                }

            }
            else{
                count=1;
            }

        }
        System.out.println("not spam");

    }
}

// public class Chat_system_spam {
//      public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine().strip();
        
//         int count=1;
//         HashMap<Character,Integer> mp=new HashMap<>();
        
//         for(int i=1;i<s.length();i++)
//         {   if(s.charAt(i)==s.charAt(i-1)){
//             count++;
//             }
//             else{
//                 count=1;
//             }
//             mp.put(s.charAt(i),count);

//             if(count>=3){
//                 System.out.println("spam");
//                 return;
//             }
//         }
//         System.out.println("not spam");

//     }
// }

