import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static void sum(long n){
        if(n < 16){
            if(n < 10){
                System.out.print(n);
            }
            else System.out.print((char)(n + 55));
        }
        else{
            sum(n/16);
            long res = n % 16;
            if(res < 10){
                System.out.print(res);
            }
            else System.out.print((char)(res + 55));
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sum(n);
    }
}
