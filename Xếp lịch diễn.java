import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int [][]a = new int[n][2];
        for(int i = 0; i < n;i++){
            a[i][0]= sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int cnt = 1;
        int end = a[0][1];
        for(int i = 1;i < n;i++){
            if(a[i][0] > end){
                end = a[i][1];
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
