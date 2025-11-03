import org.w3c.dom.css.Rect;

import java.util.*;
import java.io.*;
public class Main {
    public static boolean check(int []a ,int l,int r,int x){
        if(l > r) return false;
        int m = (int)(l + r)/2;
        if(a[m] == x){
            return true;
        }
        else if(a[m] > x){
            return check(a,l,m - 1,x);
        }
        else return check(a,m + 1,r,x);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        int x = sc.nextInt();
        Arrays.sort(a);
        if(check(a,0,n - 1,x)){
            System.out.print("1");
        }
        else System.out.print("0");
    }
}
