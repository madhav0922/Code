package Strings;

public class MaxOccurance {
    public static void main(String[] args) {
        String str = "lowercaseUPPERCASE";
        int count[] = new int[52];

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                int index = str.charAt(i) - 'a';
                count[index]++;
            } else {
                int index = str.charAt(i) - 'A' + 26;
                count[index]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        char maxChar = '\0';
        for (int i = 0; i < count.length; i++) {
            // if (count[i] > max) {
            // max = count[i];
            // maxIndex = i;
            // }
            if (count[i] > 0) {
                if (i < 26) {
                    maxChar = (char) ('a' + i);
                } else {
                    maxChar = (char) ('A' + (i % 26));
                }
                System.out.println(maxChar + ": " + count[i]);
            }
        }

    }
}
