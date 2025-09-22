import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double maxDis = 0;
        for(int i = 0; i < n - 1;i++){
            maxDis = Math.max(maxDis,a[i + 1] - a[i]);
        }
        double res = maxDis/2.0;
        maxDis = Math.max(res,1.0 * a[0]);
        maxDis = Math.max(res,1.0 * (k - a[n - 1]));
        System.out.printf("%.10f",maxDis);
    }
}
