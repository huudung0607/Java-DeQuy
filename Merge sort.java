import org.w3c.dom.css.Rect;

import java.util.*;
import java.io.*;
public class Main {
    public static void mergeSort(int []a, int l,int m,int r){
        int x1 = m - l + 1;
        int y1 = r - m;
        int []x = new int [x1];
        int []y = new int [y1];
        for(int i = l; i <= m;i++){
            x[i - l] = a[i];
        }
        for(int i = m + 1;i <= r;i++){
            y[i - (m + 1)] = a[i];
        }
        int i = 0,j = 0, cnt = l;
        while(i < x1 && j < y1){
            if(x[i] <= y[j]){
                a[cnt++] = x[i++];
            }
            else a[cnt++] = y[j++];
        }
        while(i < x1){
            a[cnt++] = x[i++];
        }
        while(j < y1){
            a[cnt++] = y[j++];
        }
    }
    public static void merge(int []a,int l,int r){
        if(l < r){
            int m = (l + r)/2;
            merge(a,l,m);
            merge(a,m + 1,r);
            mergeSort(a,l,m,r);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        merge(a,0,n - 1);
        for(int i = 0;i < n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
