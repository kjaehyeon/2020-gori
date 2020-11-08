import java.util.Scanner;

public class goricon_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        int max = 0;
        int count = 0;
        int player = 0;
        for(int i = 0 ; i < n ; i++){
            int index = scanner.nextInt();
            arr[index]++;
        }

        for(int i = 1; i < n+1; i++){
            if(arr[i] > max) {
                max = arr[i];
                player = i;
                count = 1;
                continue;
            }
            if(arr[i] == max) count++;
        }
        if(count == 1) System.out.println(player);
        else System.out.println("skipped");
    }
}
