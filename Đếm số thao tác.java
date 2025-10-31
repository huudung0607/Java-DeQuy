import java.util.*;
import java.io.*;

public class Main {
    public static int mod = 1000000007;
    public static int F(int n){
        if(n == 1) return 0;
        int res = F(n - 1) + 1;
        if(n % 2 == 0){
            res = Math.min(res,F(n/2) + 1);
        }
        if(n % 3 == 0){
            res = Math.min(res,F(n/3) + 1);
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(F(n));
    }
}
