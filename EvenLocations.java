public class EvenLocations {
    public static void main(String[] args) {
        String[] array = { "Hello", "World", "I", "am", "back" };

        System.out.println("Strings at even locations: ");
        for (int i = 0; i <= array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }

    }
}
