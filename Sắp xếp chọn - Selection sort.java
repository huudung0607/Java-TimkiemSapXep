import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static void selectionSort(List<Integer> a ,int n){
        for(int i = 0; i < n - 1;i++){
            int minPos = i;
            for(int j = i + 1; j < n; j++){
                if(a.get(j) < a.get(minPos)){
                    minPos = j;
                }
            }
            Collections.swap(a,i,minPos);
            System.out.print("Buoc " + (i + 1) + ": " + " ");
            for(var x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>(n);
        for(int i = 0; i < n;i++){
            a.add(sc.nextInt());
        }
        selectionSort(a,n);
    }
}
