
package youtube_video_learning;
import java.util.*;
public class bit_count {
    public static int minBitFlips(int start, int goal) {

        int n = start ^ goal;   // Step 1
        int count = 0;          // Step 2

        while (n != 0) {        // Step 3
            n = n & (n - 1);    // Step 4
            count++;            // Step 5
        }

        return count;           // Step 6
    }

    public static void main(String[] args) {

        int start = 10;
        int goal = 7;

        System.out.println(minBitFlips(start, goal));
    }
}
