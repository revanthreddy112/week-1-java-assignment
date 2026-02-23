class UserMainCode {
    public int sumOfPowerDigits(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits);
            temp /= 10;
        }
        return sum;
    }
}

public class task6 {
    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        int[] tests = {153, 9474, 9, 10, 100, 1634};
        for (int t : tests) {
            System.out.println(t + " => " + umc.sumOfPowerDigits(t));
        }
    }
}
