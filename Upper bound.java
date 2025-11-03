import java.util.Scanner;

public class Main {
    static int binarySearch(int[] a, int l, int r, int x, int res) {
        if (l > r) {
            return res;
        }
        int m = (l + r) / 2;
        if (a[m] > x) {
            res = m;
            return binarySearch(a, m + 1, r, x, res);
        } else {
            return binarySearch(a, l, m - 1, x, res);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        System.out.println(binarySearch(a, 0, n - 1, x, n));
        scanner.close();
    }
}
