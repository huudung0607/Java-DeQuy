import org.w3c.dom.css.Rect;

import java.util.*;
import java.io.*;
public class Main {
    public static boolean check(int []a ,int i,int n){
        if(i == n) return true;
        else if(a[i] % 2 != 0) return false;
        else return check(a,i + 1,n);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        if(check(a,0,n)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
