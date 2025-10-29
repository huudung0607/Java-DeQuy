import java.util.*;
import java.io.*;

public class Main {
    public static long gcd (long a ,long b){
        if(b == 0) return a;
        return gcd(b,a % b);
    }
    public static long lcm(long a,long b){
        return a /gcd(a,b) * b;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a =sc.nextLong(),b = sc.nextLong();
        System.out.print(gcd(a,b) + " " + lcm(a,b));
    }
}
