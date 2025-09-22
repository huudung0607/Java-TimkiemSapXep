import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static boolean search(int []a ,int l ,int r,int x){
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x){
                return true;
            }
            else if(a[m] < x){
                l = m + 1;
            }
            else r = m - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0 ;i < n ;i++){
            if(search(a,i + 1,n - 1,k + a[i])){
                System.out.print(1);
                return;
            }
        }
        System.out.print(-1);
    }
}
