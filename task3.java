public class task3 {
    public static int isPalinNum(int input1) {
        if (input1 < 0) return 1; // treat negative numbers as not palindrome

        int temp = input1;
        int rev = 0;
        while (input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }
        if (rev != temp) return 1;
        return 2;
    }

    public static void main(String[] args) {
        int[] tests = {121, 12321, 123, 10, 0, -121};
        for (int t : tests) {
            System.out.println(t + " => " + (isPalinNum(t) == 2 ? "palindrome" : "not palindrome"));
        }
    }
}
