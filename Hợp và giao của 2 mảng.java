import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Map<Integer, Integer> mp = new HashMap<>();
        Set<Integer> res = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            res.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            res.add(b[i]);
        }
        for (int x : a) {
            mp.put(x, 1);
        }
        for (int x : b) {
            if (mp.getOrDefault(x, 0) == 1) {
                mp.put(x, 2);
            }
        }
        for (int x : b) {
            if (mp.getOrDefault(x, 0) == 2) {
                System.out.print(x + " ");
                mp.put(x, 0);
            }
        }
        System.out.println();
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
