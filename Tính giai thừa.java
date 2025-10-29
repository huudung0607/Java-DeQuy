import java.util.*;
import java.io.*;

public class Main {
    public static long sum(int n){
        if(n == 0 || n == 1) return 1;
        return n * sum(n - 1);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}
