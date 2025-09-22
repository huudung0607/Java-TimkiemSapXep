    import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int n = sc.nextInt();
            int []a = new int[n];
            int maxVal = -1, minVal = Integer.MAX_VALUE;
            Set<Integer> se = new HashSet<>();
            for(int i = 0;i < n ;i++){
                a[i] = sc.nextInt();
                maxVal = Math.max(maxVal,a[i]);
                minVal = Math.min(minVal,a[i]);
                se.add(a[i]);
            }
            int cnt = 0;
            for(int i = minVal;i <= maxVal;i++) {
                if (se.contains(i)) {
                    continue;
                } else cnt++;
            }
            System.out.print(cnt);
        }
    }
