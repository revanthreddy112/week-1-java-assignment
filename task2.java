public class task2 {
    public static long nthFibonacci(int n) {
        // Define: nthFibonacci(1) = 0, nthFibonacci(2) = 1
        if (n <= 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        long a = 0;
        long b = 1;
        long c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java task2 <n>");
            System.out.println("Example: java task2 7");
            System.out.println("Sample: nthFib(7) = " + nthFibonacci(7));
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println(nthFibonacci(n));
        } catch (NumberFormatException e) {
            System.out.println("First arg must be an integer.");
        }
    }
}
