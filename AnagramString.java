import java.util.Arrays;

public class AnagramString {

    public static boolean AreAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String input1 = "Race";
        String input2 = "Care";

        boolean result = AreAnagrams(input1, input2);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
