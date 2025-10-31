import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static void printR(long n){
        if(n < 10) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n % 10 + " ");
        printR(n/10);
    }
    public static void printL(long n){
        if(n > 0){
            printL(n/10);
            System.out.print(n % 10 + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        printL(n);
        System.out.println();
        printR(n);
    }
}
