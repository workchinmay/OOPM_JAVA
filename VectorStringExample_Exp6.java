import java.util.Vector;
import java.util.Scanner;

public class VectorStringExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        Scanner scanner = new Scanner(System.in);
        
        int n;
        System.out.print("Enter the number of strings to add to the vector: ");
        n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String str = scanner.next();
            vector.add(str);
        }

        System.out.print("Enter a new string to check in the vector: ");
        String newStr = scanner.next();
        
        if (vector.contains(newStr)) {
            vector.remove(newStr);
            System.out.println("String '" + newStr + "' is present in the vector and has been removed.");
        } else {
            vector.add(newStr);
            System.out.println("String '" + newStr + "' is not present in the vector and has been added.");
        }

        System.out.println("Updated vector contents:");
        for (String str : vector) {
            System.out.println(str);
        }

        scanner.close();
    }
}
