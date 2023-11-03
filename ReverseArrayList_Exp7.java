import java.util.ArrayList;

public class ReverseArrayList {
    public static void printReverseArrayList(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Reversed ArrayList:");
        printReverseArrayList(numbers);
    }
}
