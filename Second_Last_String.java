public class Second_Last_String {
    public static void main(String[] args) {
        String[] array = { "First", "Second", "Third", "Fourth" };

        if (array.length >= 2) {
            System.out.println("Second Last String: " + array[array.length - 2]);
        } else {
            System.out.println("Array does not have enough elements to find the second last string.");
        }
    }
}
