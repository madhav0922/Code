package Strings;

public class ReplaceSpacewith40 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        if (str.toString().isEmpty()) {
            System.out.println("Empty String");
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str = new StringBuilder(str.substring(0, i) + "%40" + str.substring(i + 1, str.length()));
            }
        }
        System.out.println(str);

        String s = "daabcbaabcbc";
        s = s.substring(0, 4 - 3 + 1);
        System.out.println(s);
    }
}
