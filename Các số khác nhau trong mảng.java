import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        long []a = new long[(int)n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int cnt = 1;
        for(int i = 1; i < n; i++){
            if(a[i] != a[i - 1]){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
