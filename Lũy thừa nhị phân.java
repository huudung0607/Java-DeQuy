import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static long binPow(long a,long b,int mod){
        if (b == 0) {
            return 1;
        }
        long res = binPow(a, b/2,mod);
        if (b % 2 == 1){
            return (((res % mod) * (res % mod)) % mod) * (a % mod)%mod;
        }
        return ((res % mod) * (res % mod)) % mod;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a =sc.nextLong(),b = sc.nextLong();
        System.out.print(binPow(a,b,mod));

    }
}
