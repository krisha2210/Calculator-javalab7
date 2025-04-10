//Main.java
//Krisha, 512, B3
class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        while (true) {
            int choice = userInput.getMenuChoice();
            switch (choice) {
                case 1 -> {
                    int[] numbers = userInput.getTwoNumbers();
                    System.out.println("Sum is: " + calculator.add(numbers[0], numbers[1]));
                }
                case 2 -> {
                    int[] numbers = userInput.getTwoNumbers();
                    System.out.println("Difference is: " + calculator.subtract(numbers[0], numbers[1]));
                }
                case 3 -> {
                    int[] numbers = userInput.getTwoNumbers();
                    System.out.println("Product is: " + calculator.multiply(numbers[0], numbers[1]));
                }
                case 4 -> {
                    int[] numbers = userInput.getTwoNumbers();
                    try {
                        System.out.println("Quotient is: " + calculator.divide(numbers[0], numbers[1]));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    int n = userInput.getSingleNumber("Enter the position for Fibonacci sequence:");
                    System.out.println("Fibonacci number: " + calculator.fibonacci(n));
                }
                case 6 -> {
                    double[] array = userInput.getArrayInput();
                    System.out.println("Mean of the array: " + calculator.mean(array));
                }
                case 7 -> {
                    double[] array = userInput.getArrayInput();
                    System.out.println("Variance of the array: " + calculator.variance(array));
                }
                case 8 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
