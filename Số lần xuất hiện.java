import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static int binaryFirst(List<Integer> a, int l, int r, int x, int res) {
        if (l > r) {
            return res;
        }
        int m = (l + r) / 2;
        if (a.get(m) == x) {
            res = m;
            return binaryFirst(a, l, m - 1, x, res);
        } else if (a.get(m) < x) {
            return binaryFirst(a, m + 1, r, x, res);
        } else {
            return binaryFirst(a, l, m - 1, x, res);
        }
    }

    static int binaryLast(List<Integer> a, int l, int r, int x, int res) {
        if (l > r) return res;
        int m = (l + r) / 2;
        if (a.get(m) == x) {
            res = m;
            return binaryLast(a, m + 1, r, x, res);
        } else if (a.get(m) < x) {
            return binaryLast(a, m + 1, r, x, res);
        } else {
            return binaryLast(a, l, m - 1, x, res);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int x = scanner.nextInt();
        int first = binaryFirst(a, 0, n - 1, x, -1);
        int last = binaryLast(a, 0, n - 1, x, -1);
        if (first == -1 || last == -1) {
            System.out.println(0);
        } else {
            System.out.println(last - first + 1);
        }
        scanner.close();
    }
}
