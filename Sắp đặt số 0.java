import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int cnt = 0;
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            if(x != 0) a.add(x);
            else cnt++;
        }
        for(int i = 0;i < n - cnt;i++){
            System.out.print(a.get(i) + " ");
        }
        for(int i = 0;i < cnt;i++) System.out.print(0 + " ");
    }
}
