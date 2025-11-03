import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<int[]> v = new ArrayList<>();

    static void chuyen(int n, int a, int c) {
        v.add(new int[]{a, c});
    }

    static void thap(int n, int a, int b, int c) {
        if (n == 1) {
            chuyen(n, a, c);
        } else {
            thap(n - 1, a, c, b);
            chuyen(n, a, c);
            thap(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 2, c = 3;
        thap(n, a, b, c);
        System.out.println(v.size());
        for (int[] x : v) {
            System.out.println(x[0] + " " + x[1]);
        }
        sc.close();
    }
}
