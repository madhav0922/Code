package Arrays;

public class CheckPallindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");
        System.out.println(str);
        StringBuilder rev = new StringBuilder(str);
        int low = 0, high = str.length() - 1;
        while (low <= high) {
            char temp = rev.charAt(low);
            rev.setCharAt(low, rev.charAt(high));
            rev.setCharAt(high, temp);
            low++;
            high--;
        }
        if (str.equalsIgnoreCase(rev.toString())) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }
}
