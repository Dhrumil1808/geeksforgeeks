import java.util.Scanner;

/**
 * Created by dhrumil on 6/8/17.
 */
public class matrix_rotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int[][] arr = new int[in][in];
        for (int i = 0; i < in; i++) {
            for (int j = 0; j < in; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int f = in / 2 + 1;
        int c = in / 2 + 1;


        for (int x=0;x<f-1;x++) {

            for (int y = 0; y < c - 1; y++)

            {
                int temp = arr[x][y];
                arr[x][y] =arr[y][in - 1 - x];
                arr[y][ in - 1 - x] =arr[in - 1 - x][in - 1 - y];
                arr[in - 1 - x] [in - 1 - y] =arr[in - 1 - y][x];
                arr[in - 1 - y][ x] =temp;


            }
        }


        for (int i = 0; i < in; i++) {
            for (int j = 0; j < in; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
