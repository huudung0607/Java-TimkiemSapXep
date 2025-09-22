import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []a = new int[n];
        TreeSet<Integer> se = new TreeSet<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        for(int i = 0 ;i < n;i++){
            var tmp = se.higher(a[i]);
            if(tmp == null){
                System.out.print("_" + " ");
            }
            else System.out.print(tmp + " ");
        }

    }
}
