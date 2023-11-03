// Define a Stack interface
interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}

// Concrete class that implements the Stack interface using an array
class ArrayStack<T> implements Stack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public ArrayStack() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void push(T item) {
        if (size == elements.length) {
            // If the stack is full, double its capacity
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = (T) elements[--size];
        elements[size] = null; // Clear the reference to the removed item
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
