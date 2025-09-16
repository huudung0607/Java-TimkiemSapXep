import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static int firstPos(int []a, int l,int r, int x){
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x){
                res = m;
                r = m - 1;
            }
            else if(a[m] < x) l = m + 1;
            else r = m - 1;
        }
        return res;
    }
    public static int lastPos(int []a, int l,int r, int x){
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x){
                res = m;
                l = m + 1;
            }
            else if(a[m] < x) l = m + 1;
            else r = m - 1;
        }
        return res;
    }
    public static int lowerBound(int []a, int l,int r, int x){
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] >= x){
                res = m;
                r = m - 1;
            }
            else l = m + 1;
        }
        return res;
    }
    public static int upperBound(int []a, int l,int r, int x){
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] > x){
                res = m;
                r = m - 1;
            }
            else l = m + 1;
        }
        return res;
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), x = sc.nextInt();
        int []a = new int [n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int pos1 = firstPos(a,0,n-1,x);
        int pos2 =lastPos(a,0,n-1,x);
        int pos3 = lowerBound(a,0,n-1,x);
        int pos4 = upperBound(a,0,n-1,x);
        System.out.println(pos1 + "\n" + pos2 + "\n" + pos3 + "\n" + pos4);
        if(pos1 == -1){
            System.out.print(0);
        }
        else System.out.print(pos2 - pos1 + 1);
    }
}
