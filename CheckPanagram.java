import java.util.Arrays;

public class CheckPanagram {

    public static boolean isPanagram(String str) {
        boolean[] mark = new boolean[26];
        Arrays.fill(mark, false);
        int index = 0;

        for (char ch : str.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
            } else if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
            }
            mark[index] = true;
        }

        for (boolean b : mark) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Hello World I am back";
        System.out.println(isPanagram(str));
    }
}
