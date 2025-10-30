import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static void sum(long n){
        if(n < 2) System.out.print(n);
        else{
            sum(n/2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sum(n);
    }
}
