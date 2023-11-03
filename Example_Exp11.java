class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Example {
    public static void someMethod(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative values are not allowed");
        }
    }

    public static void main(String[] args) {
        try {
            int value = Integer.parseInt(args[0]);
            someMethod(value);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
