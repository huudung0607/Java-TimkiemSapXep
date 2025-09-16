import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static void insertionSort(int []a ,int n){
        for(int i = 1; i < n;i++){
            int pos = i - 1, value = a[i];
            while(pos >= 0 && value < a[pos]){
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = value;
            System.out.print("Buoc " + i + ": " + " ");
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
        int []a = new int [n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        insertionSort(a,n);
    }
}
