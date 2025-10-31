import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static boolean check(long n){
        long r = n % 10;
        if(n == 0) return true;
        if(r % 2 != 0) return false;
        return check(n/10);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(check(n)){
            System.out.println("YES");
        }
        else System.out.print("NO");
    }
}
