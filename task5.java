class UserMainCode {
    public int countPrimesInRange(int input1, int input2) {
        // Ensure input1 <= input2
        if (input2 < input1) {
            int t = input1;
            input1 = input2;
            input2 = t;
        }
        int start = Math.max(2, input1);
        int count = 0;
        for (int d = start; d <= input2; d++) {
            if (isPrime(d)) count++;
        }
        return count;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class task5 {
    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        int[][] tests = {
            {2, 10},
            {1, 10},
            {0, 2},
            {10, 2},
            {-5, 5},
            {20, 29},
            {100, 110}
        };
        for (int[] t : tests) {
            int a = t[0], b = t[1];
            System.out.println(a + ", " + b + " => " + umc.countPrimesInRange(a, b));
        }
    }
}