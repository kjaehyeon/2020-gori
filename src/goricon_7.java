import java.util.*;

public class goricon_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][]maze = new int[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                maze[i][j] = scanner.nextInt();
        }
        System.out.println(2^3);

    }
}
