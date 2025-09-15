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
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
            mp.put(a[i],mp.getOrDefault(a[i],0) + 1);
        }
        int minVal = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++){
            if(mp.get(a[i]) > maxFreq || mp.get(a[i]) == maxFreq && a[i] < minVal){
                minVal = a[i];
                maxFreq = mp.get(a[i]);
            }
        }
        System.out.print(minVal + " " + maxFreq);
    }
}
