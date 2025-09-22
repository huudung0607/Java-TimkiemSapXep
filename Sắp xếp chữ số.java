import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []a = new int[n];
        TreeSet<Integer> se = new TreeSet<>();
        for(int i = 0;i < n ;i++){
            a[i] = sc.nextInt();
            while(a[i] != 0){
                int lastNum = a[i] % 10;
                se.add(lastNum);
                a[i]/=10;
            }
        }
        for(int i : se) System.out.print(i + " ");
    }
}
