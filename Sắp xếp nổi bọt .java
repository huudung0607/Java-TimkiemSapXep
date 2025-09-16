import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static void bubbleSort(int []a ,int n){
        for(int i = 0; i < n - 1;i++){
            for(int j = 0 ;j < n - 1;j++){
                if(a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
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
        int []a = new int [n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        bubbleSort(a,n);
    }
}
