import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static long maxNum(long n){
        if(n < 10) return n;
        long tmp = maxNum(n/10);
        if(n % 10 > tmp){
            return n % 10;
        }
        else return tmp;
    }
    public static long minNum(long n){
        if(n < 10) return n;
        long tmp = minNum(n/10);
        if(n % 10 < tmp){
            return n % 10;
        }
        else return tmp;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(maxNum(n) + " " + minNum(n));
    }
}
