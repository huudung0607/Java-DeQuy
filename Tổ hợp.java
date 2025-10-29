import java.util.*;
import java.io.*;

public class Main {
    public static long sum(int n,int k){
        if(k == 0 || k == n) return 1;
        return sum(n - 1,k - 1) + sum(n - 1,k);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.print(sum(n,k));
    }
}
