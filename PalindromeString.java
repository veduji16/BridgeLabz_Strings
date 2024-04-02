package Strings;

public class PalindromeString {

    public static boolean IsPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        String input = "Geeks";
        boolean result = IsPalindrome(input.toLowerCase());
        System.out.println(result);
    }
}