import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        Integer []a = new Integer[n];
        for(int i = 0;i < n ;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a,1,n,Collections.reverseOrder());
        long sum = a[0];
        for(int i = 1;i < n;i++){
            if(i <= k){
                sum += a[i];
            }
            else sum -= a[i];
        }
        System.out.print(sum);
    }
}
