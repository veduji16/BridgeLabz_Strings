package Strings;

public class ReverseString {
    public static void main(String[] args) {

        String input = "Geeks";
        String reverse = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            reverse = ch + reverse;
        }

        System.out.println("Original word: " + input);
        System.out.println("Reversed word: " + reverse);
    }
}
