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
        int cnt = 0;
        int i = 0, j = n - 1;
        while(i <= j){
            if(a[i] + a[j] <= k){
                i++;j--;
                cnt++;
            }
            else{
                j--;
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
