class Person {
    String name;
    int age;

    // Constructor with name and age parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    Person() {
        this("Unknown", 0); // Calls the parameterized constructor with default values
    }

    // Constructor with name parameter
    Person(String name) {
        this(name, 0); // Calls the parameterized constructor with age default value
    }

    // Display the person's information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        System.out.println("Person 1:");
        person1.displayInfo();

        Person person2 = new Person("Alice");
        System.out.println("\nPerson 2:");
        person2.displayInfo();

        Person person3 = new Person();
        System.out.println("\nPerson 3:");
        person3.displayInfo();
    }
}
