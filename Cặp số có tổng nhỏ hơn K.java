    import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static int firstPos(int []a ,int l,int r, int x){
            int res = -1;
            while(l <= r){
                int m = (l + r)/2;
                if(a[m] == x){
                    res = m;
                    r = m -1;
                }
                else if(a[m] < x) l = m + 1;
                else r = m - 1;
            }
            return res;
        }
        public static int lastPos(int []a ,int l,int r, int x){
            int res = -1;
            while(l <= r){
                int m = (l + r)/2;
                if(a[m] < x){
                    res = m;
                    l = m + 1;
                }
                else r = m - 1;
            }
            return res;
        }
        public static void main(String[] args) {
            int n = sc.nextInt(), k = sc.nextInt();
            int []a = new int[n];
            for(int i = 0;i < n ;i++){
                a[i] = sc.nextInt();
            }
            long ans = 0;
            Arrays.sort(a);
            for(int i = 0; i < n ;i++){
                int pos = lastPos(a,i + 1, n - 1,k - a[i]);
                if(pos != -1){
                    ans += 1l * pos - i;
                }
            }
            System.out.print(ans);
        }
    }
