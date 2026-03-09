package youtube_video_learning;
import java.util.*;

public class transpose_matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Input matrix
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose matrix:");

        // Transpose
        for(int j = 0; j < c; j++){
            for(int i = 0; i < r; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}