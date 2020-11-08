import java.util.*;

public class goricon_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for(int i =0 ;i < n; i++)
            arr[i] = scanner.nextInt();

        Arrays.sort(arr);

        for(int i = n -1; i >= center_index(arr.length)-1; i--){
            sum += arr[i] *2;
        }

        if(arr.length %2 == 1 && arr.length > 1) sum -= arr[(n+1)/2 -1];

        System.out.println(sum);
    }
    static int center_index(int size){
        if(size %2 ==1) return (size+1)/2;
        else return size/2 +1;
    }
}
