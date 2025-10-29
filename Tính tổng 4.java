import java.util.*;
import java.io.*;

public class Main {
    public static long sum(int n){
        if(n == 1) return -1;
        if(n % 2 == 0){
            return n + sum(n - 1);
        }
        else return -n + sum(n - 1);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}
