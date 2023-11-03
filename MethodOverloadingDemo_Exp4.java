public class MethodOverloadingDemo {
    // Method with no parameters
    public void print() {
        System.out.println("Method with no parameters");
    }

    // Method with one integer parameter
    public void print(int x) {
        System.out.println("Method with an integer parameter: " + x);
    }

    // Method with two integer parameters
    public void print(int x, int y) {
        System.out.println("Method with two integer parameters: " + x + " and " + y);
    }

    // Method with a double parameter
    public void print(double d) {
        System.out.println("Method with a double parameter: " + d);
    }

    // Method with a string parameter
    public void print(String s) {
        System.out.println("Method with a string parameter: " + s);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        demo.print(); // Calls the method with no parameters
        demo.print(42); // Calls the method with an integer parameter
        demo.print(3, 4); // Calls the method with two integer parameters
        demo.print(3.14); // Calls the method with a double parameter
        demo.print("Hello, Method Overloading!"); // Calls the method with a string parameter
    }
}
