import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();// m = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> se = new HashSet<>();
        for(int i =0;i < n;i++){
            int x = sc.nextInt(); se.add(x);
        }
        System.out.println(se.size());
    }
}
