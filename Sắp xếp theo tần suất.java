import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer []a = new Integer[n];
        Integer []b = new Integer[n];
        Map<Integer,Integer> mp = new LinkedHashMap<>();
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            a[i] = x; b[i] = x;
            mp.put(x, mp.getOrDefault(x,0) + 1);
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (mp.get(o2).equals(mp.get(o1))) {
                    return o1.compareTo(o2);
                }
                return mp.get(o2) - mp.get(o1);
            }
        });
        for(int i : a) System.out.print(i + " ");
        System.out.println();
        Arrays.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return mp.get(o2).compareTo(mp.get(o1));
            }
        });
        for(int i : b){
            if(mp.containsKey(i)){
                for(int j = 0;j < mp.get(i);j++){
                    System.out.print(i + " ");
                }
                mp.remove(i);
            }
        }
    }
}
