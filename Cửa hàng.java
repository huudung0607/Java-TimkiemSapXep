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
        int []b = new int[n];
        for(int i = 0;i <n;i++){
            a[i] = sc.nextInt();b[i] = sc.nextInt();
        }
        Arrays.sort(a);Arrays.sort(b);
        int cnt = 1;
        int maxVal = 0, i = 1, j = 0;
        while(i < n && j < n){
            if(a[i] <= b[j]){
                cnt++;
                maxVal = Math.max(maxVal,cnt);
                i++;
            }
            else{
                cnt--;
                j++;
            }
        }
        System.out.print(maxVal);
    }
}
