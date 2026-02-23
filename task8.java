class UserMainCode {
    public int mostFrequentDigit(int n) {
        n = Math.abs(n);
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int max = 0, digit = 0;
        for (int i = 9; i >= 0; i--) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }
        return digit;
    }
}

public class task8 {
    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        int[] tests = {112233, 1111, 123456, 0, -5555, 1000};
        for (int t : tests) {
            System.out.println(t + " => " + umc.mostFrequentDigit(t));
        }
    }
}
