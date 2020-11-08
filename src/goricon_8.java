import java.util.*;

public class goricon_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean[] avail_potion = new boolean[n+1];
        boolean decider = true;
        int[][] recipe = new int[5][7];

        for(int i = 0; i <= n; i++)
            avail_potion[i] = false;

        for(int i = 0; i < m; i++){
            int tmp = scanner.nextInt();
            recipe[i][0] = tmp;
            for(int j = 1; j <= tmp+1; j++){
                recipe[i][j] = scanner.nextInt();
            }
        }
        int tmp = scanner.nextInt();
        for(int i = 0; i < tmp; i++){
            int index = scanner.nextInt();
            avail_potion[index] = true;
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                for(int k = 1; k <= recipe[j][0]; k++){
                    if(avail_potion[recipe[j][k]] == false){
                        decider = false;
                        break;
                    }
                    if(decider == false) break;
                }
                if(decider == true){
                    avail_potion[recipe[j][recipe[j][0]+1]] = true;
                }else decider = true;
            }
        }

        int count = 0;
        for(int i = 0; i < avail_potion.length; i++)
            if(avail_potion[i] == true) count++;

        System.out.println(count);
        for(int i = 0; i < avail_potion.length; i++){
            if(avail_potion[i] == true) System.out.print(i+" ");
        }
        System.out.println();
    }
}
