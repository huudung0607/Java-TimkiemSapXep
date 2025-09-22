import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int []a = new int[n]; int []b = new int[m];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        for(int i = 0;i < m;i++) b[i] = sc.nextInt();
        int i = 0, j = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int cnt = 0;
        while(i < n && j < m){
            if(b[j] >= a[i] - k && b[j] <= a[i] + k){
                i++;j++;cnt++;
            }
            else if(b[j] < a[i] - k){
                j++;
            }
            else i++;
        }
        System.out.print(cnt);
    }
}
