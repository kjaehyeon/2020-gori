import java.util.*;

public class goricon_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            sum += (double)arr[i]/2.0;
        }
        sum += (double)arr[n-1];

        System.out.println(sum);
    }
}
