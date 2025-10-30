import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static long sum(long n){
        if(n < 10) return 1;
        return 1 + sum(n/10);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(sum(n));
    }
}
