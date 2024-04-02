public class CheckVowels {
    public static void main(String[] args) {
        String str = "Hello World, I am back";
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                System.out.println(ch + " is a vowel.");
            }
        }
        System.out.println("String contains " + count + " vowels");
    }
}
