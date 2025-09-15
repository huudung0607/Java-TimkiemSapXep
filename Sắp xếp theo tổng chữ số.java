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
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(sum(o1) == sum(o2)){
                    return o1 - o2;
                }
                return sum(o1) - sum(o2);
            }
        });
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
