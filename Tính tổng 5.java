import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static double sum(int n){
        if(n == 1) return 1;
        return (double)1/n + sum(n - 1);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.3f",sum(n));
    }
}
