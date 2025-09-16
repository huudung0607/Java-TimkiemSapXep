import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer []a = new Integer[n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        int sua = 0;
        for(int i = 0;i < n ;i++){
            if(a[i] - i < 0){
                sua += 0;
            }
            else sua += a[i] - i;
        }
        System.out.print(sua);
    }
}
