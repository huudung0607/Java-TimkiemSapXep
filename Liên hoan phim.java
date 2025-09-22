import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer [][]a = new Integer[n][2];
        for(int i = 0;i < n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1];
            }
        });
        int dem = 1;
        int kt = a[0][1];
        for(int i = 1;i < n;i++){
            if(a[i][0] >= kt){
                kt = a[i][1];
                dem++;
            }
        }
        System.out.print(dem);
    }
}
