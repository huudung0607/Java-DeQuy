import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static boolean check(int []a, int l,int r){
        if(l > r) return true;
        else {
            if(a[l] != a[r]){
                return false;
            }
            else return check(a,l + 1,r - 1);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        if(check(a,0,n - 1)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
