class UserMainCode {
    public String secondWordUpper(String str) {
        String[] words = str.split(" ");
        if (words.length < 2) return "LESS";
        return words[1].toUpperCase();
    }
}

public class task10 {
    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        String[] tests = {
            "Hello World",
            "Java Programming Language",
            "Single",
            "one two three four",
            ""
        };
        for (String t : tests) {
            System.out.println("\"" + t + "\" => " + umc.secondWordUpper(t));
        }
    }
}
