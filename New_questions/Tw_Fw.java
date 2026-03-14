package New_questions;
import java.util.*;

public class Tw_Fw {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int w=sc.nextInt();

        if(w%2!=0 || w<2*v || w>4*v){

            System.out.println(-1);
            return;
        }
        int fourwheelers =(w-2*v)/2;
        int twowheelers=v-fourwheelers;
        System.out.println(twowheelers+ " "+ fourwheelers);

    }
    
}
