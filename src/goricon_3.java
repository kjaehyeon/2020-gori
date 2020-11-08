import java.util.*;

public class goricon_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, H, W;
        N = scanner.nextInt();
        H = scanner.nextInt();
        W = scanner.nextInt();
        scanner.nextLine();
        char[] original = new char[N];
        for(int i = 0; i < N; i++)
            original[i] = '?';

        String[] strings = new String[H];

        for(int i = 0; i < H; i++)
            strings[i] = scanner.nextLine();

        int startpos = 0;
        for(int i = 0; i < H; i++){
            for(int j = startpos; j < strings[i].length(); j++){
                if(strings[i].charAt(j) != '?' && original[j/W] == '?') {
                    original[j/W] =strings[i].charAt(j);
                }
            }
        }
        String str = new String(original);
        System.out.println(str);
    }
}
