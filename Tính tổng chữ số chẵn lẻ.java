import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static long tongChan(long n){
        if (n == 0) {
            return 0;
        }
        long r = n % 10;if (r % 2 == 0)
        {
            return r + tongChan(n / 10);
        }
        return tongChan(n / 10);
    }
    public static long tongLe(long n){
        if (n == 0) {
            return 0;
        }
        long r = n % 10;
        if (r % 2 != 0) {
            return r + tongLe(n / 10);
        }
        return tongLe(n / 10);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(tongChan(n) + "\n" + tongLe(n));
    }
}
