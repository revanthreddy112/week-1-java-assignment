class UserMainCode {
    public int sumNonPrimeIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(i)) sum += arr[i];
        }
        return sum;
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

public class task9 {
    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        int[][] tests = {
            {10, 20, 30, 40, 50},
            {1, 2, 3, 4, 5, 6},
            {5, 10, 15, 20}
        };
        for (int[] t : tests) {
            System.out.println("Array: " + java.util.Arrays.toString(t) + " => " + umc.sumNonPrimeIndex(t));
        }
    }
}

