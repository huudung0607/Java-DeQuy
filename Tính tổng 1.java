    import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        public static int sum(int n){
            if(n == 1) return 1;
            return n + sum(n - 1);
        }
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int n = sc.nextInt();
            System.out.print(sum(n));
        }
    }
