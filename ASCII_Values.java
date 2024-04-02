public class ASCII_Values {
    public static void main(String[] args) {
        String str = "A";
        for (int i = 0; i < str.length(); i++) {
            System.out.println("ASCII value of '" + str.charAt(i) + "': " + (int) str.charAt(i));
        }
    }
}
