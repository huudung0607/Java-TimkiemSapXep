import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int []a = new int [n];
        int []b = new int[m];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a); Arrays.sort(b);
        int cnt = 0;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(a[i] > b[j]){
                cnt++;
                i++;
                j++;
            }
            else if(a[i] <= b[j]){
                i++;
            }
        }
        System.out.print(cnt);
    }
}
