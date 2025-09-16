import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer []a = new Integer[n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        int gach = a[0];
        int cnt = 1;
        for(int i = 1 ;i < n ;i++){
            if(gach >= 1){
                cnt++;
                gach = Math.min(gach - 1,a[i]);
            }
            else break;
        }
        System.out.print(cnt);
    }
}
