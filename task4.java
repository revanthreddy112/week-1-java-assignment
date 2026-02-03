class UserMainCode
{
    public int addLastDigits(int input1,int input2)
    {
        if(input1<0)
            input1=(-1)*input1;
        if(input2<0)
            input2=(-1)*input2;
        return (input1%10)+(input2%10);
    }
}

public class task4 {
    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        int[][] tests = {
            {5, 3},
            {-12, 9},
            {-7, -3},
            {10, 20},
            {0, -5}
        };
        for (int[] t : tests) {
            int a = t[0], b = t[1];
            System.out.println(a + ", " + b + " => " + umc.addLastDigits(a, b));
        }
    }
}

