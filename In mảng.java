import org.w3c.dom.css.Rect;

import java.util.*;
import java.io.*;
public class Main {
    public static void printR(int []a ,int i,int n){
        if(i == n - 1) {
            System.out.print(a[n - 1]);
            return;
        }
        System.out.print(a[i] + " ");
        printR(a,i + 1,n);
    }
    public static void printL(int []a ,int i ,int n){
        if(i == 0){
            System.out.print(a[i]);
            return;
        }
        System.out.print(a[i] + " ");
        printL(a,i - 1,n);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        printR(a,0,n);
        System.out.println();
        printL(a,n - 1,n);
    }
}
