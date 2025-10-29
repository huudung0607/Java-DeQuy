import java.util.*;
import java.io.*;

public class Main {
    public static long sum(int n){
        if(n == 1) return 0;
        if(n == 2) return 1;
        return sum(n - 1) + sum(n - 2);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}
