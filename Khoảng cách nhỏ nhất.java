import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static int sum(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n/=10;
        }
        return sum;
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer []a = new Integer[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int minValue = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            if(a[i] - a[i - 1] < minValue){
                minValue = a[i] - a[i - 1];
            }
        }
        System.out.print(minValue);
    }
}
