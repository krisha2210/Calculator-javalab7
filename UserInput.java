//UserInput.java
import java.util.Scanner;

class UserInput {
    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public int[] getTwoNumbers() {
        int[] numbers = new int[2];

        System.out.println("Enter 1st Number:");
        numbers[0] = scanner.nextInt();

        System.out.println("Enter 2nd Number:");
        numbers[1] = scanner.nextInt();

        return numbers;
    }

    public int getSingleNumber(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public double[] getArrayInput() {
        System.out.println("Enter numbers for the array (space-separated):");
        scanner.nextLine(); // Consume leftover newline
        String[] input = scanner.nextLine().split(" ");
        double[] array = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Double.parseDouble(input[i]);
        }
        return array;
    }

    public int getMenuChoice() {
        System.out.println("""
                Choose an operation:
                1. Add
                2. Subtract
                3. Multiply
                4. Divide
                5. Fibonacci Sequence
                6. Mean of Array
                7. Variance of Array
                8. Exit
                """);
        return scanner.nextInt();
    }
}
