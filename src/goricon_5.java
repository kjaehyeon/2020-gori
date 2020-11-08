import java.util.*;

public class goricon_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double L = scanner.nextDouble();
        double total_center = 0;
        boolean decider = true;
        int[] box = new int[n];
        for(int i = 0; i < n; i++)
            box[i] = scanner.nextInt();

        for(int i = n-1; i >0; i--){
            total_center += (double)box[i];
            if(box[i] < box[i-1] - (2.0*L) && box[i] > box[i-1] + (2.0*L)){
                decider = false;
                break;
            }
            if(total_center / ((double)n - (double)i) > box[i-1] - L
                    && total_center / ((double)n - (double)i) < box[i-1] + L)
                continue;
            else{
                decider = false;
                break;
            }
        }

        if(decider ==true) System.out.println("stable");
        else System.out.println("unstable");

    }
}
