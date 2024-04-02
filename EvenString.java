public class EvenString {

    public static void main(String[] args) {
        String input = "Hello World I am Back!";

        String[] words = input.split(" ");
        int[] wordsLength = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            wordsLength[i] = words[i].length();
        }

        for (int i = 0; i < words.length; i++) {
            if (wordsLength[i] % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }
}
