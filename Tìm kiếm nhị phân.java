import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static boolean check(int []a, int l ,int r,int x){
        while(l <= r){
            int m = (int)(l + r)/2;
            if(a[m] == x) return true;
            else if(a[m] < x) l = m + 1;
            else r = m - 1;
        }
        return false;
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []a = new int [n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        for(int i = 0; i < q;i++){
            int x = sc.nextInt();
            if(check(a,0,n - 1,x)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
