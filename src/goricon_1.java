
import java.util.*;

public class goricon_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int row = 0, col = 1;
        boolean decider = true;
        char[][] table = new char[n][n];

        for(int i = 0 ; i < n; i++){
            String tmp = scanner.nextLine();
            tmp.trim();
            for(int j = 0; j < n; j++){
                table[i][j] = tmp.charAt(j);
            }
        }

        for(int i = 0; i < n-1; i++){ //row
            for(int j = i+1; j < n; j++ ){
                if(table[i][j] != table[j][i]){
                    decider = false;
                    break;
                }
            }
            if(decider == false) break;
        }

        if(decider == true) System.out.println("YES");
        else System.out.println("NO");
    }
}