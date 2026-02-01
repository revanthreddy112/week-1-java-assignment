public class task1 {
    public static int EvenOddDigitsSum(int input1, String input2) {
        int sum = 0;
        input2 = input2.toLowerCase();
        while (input1 > 0) {
            int d = input1 % 10;
            if ("even".equals(input2) && d % 2 == 0) sum += d;
            if ("odd".equals(input2) && d % 2 != 0) sum += d;
            input1 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java task1 <number> <even|odd>");
            System.out.println("Example: java task1 12345 odd");
            // sample run
            System.out.println("Sample: sum of odd digits in 12345 = " + EvenOddDigitsSum(12345, "odd"));
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            String mode = args[1];
            if (!mode.equalsIgnoreCase("even") && !mode.equalsIgnoreCase("odd")) {
                System.out.println("Second arg must be 'even' or 'odd'");
                return;
            }
            System.out.println(EvenOddDigitsSum(n, mode));
        } catch (NumberFormatException e) {
            System.out.println("First arg must be an integer.");
        }
    }
}
