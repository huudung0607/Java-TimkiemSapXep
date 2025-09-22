import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []a = new int[n + 1];
        int []b = new int[n + 1];
        for(int i = 1;i <= n;i++){
            a[i] = sc.nextInt();
        }
        int j = 1;
        Arrays.sort(a);
        for(int i = 1;i <= n;i += 2) b[i] = a[j++];
        for(int i = 2;i <= n;i += 2) b[i] = a[j++];
        for(int i = 1;i <= n;i++) System.out.print(b[i] + " ");
    }
}
