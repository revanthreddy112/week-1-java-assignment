class UserMainCode {
    public int uniqueDigitCount(int n) {
        n = Math.abs(n);
        boolean[] seen = new boolean[10];
        int count = 0;

        while (n > 0) {
            int d = n % 10;
            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }
}

public class task7 {
    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        int[] tests = {123, 1223, 111, 1234567890, 0, -456, 100};
        for (int t : tests) {
            System.out.println(t + " => " + umc.uniqueDigitCount(t));
        }
    }
}
