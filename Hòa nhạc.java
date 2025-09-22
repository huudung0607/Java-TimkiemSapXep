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
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            mp.put(a[i],mp.getOrDefault(a[i],0)+ 1);
        }
        for(int i = 0;i < k;i++){
            int x = sc.nextInt();
            var key = mp.floorKey(x);
            if(key == null){
                System.out.println(-1);
            }
            else{
                System.out.println(key);
                int cnt = mp.get(key);
                if(cnt == 1){
                    mp.remove(key);
                }
                else{
                    mp.put(key,cnt - 1);
                }
            }
        }
    }
}
