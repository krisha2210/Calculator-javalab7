Calculator in Java

Main.java that contains - 

main(String[] args):
Creates instances of UserInput and Calculator and manages the menu-driven operation selection.


UserInput.java contains -

1.	UserInput(): Initializes input handling with Scanner.
2.	int[] getTwoNumbers(): Prompts the user to input two integers and returns them as an array.
3.	int getSingleNumber(String message): Captures a single integer with a custom prompt.
4.	double[] getArrayInput(): Collects multiple numbers as a double array from user input.
5.	int getMenuChoice(): Displays the menu and returns the user's choice.


Calculator.java that contains - 
1.	add(int a, int b): Returns the sum of two integers.
2.	subtract(int a, int b): Returns the difference of two integers.
3.	multiply(int a, int b): Returns the product of two integers.
4.	divide(int a, int b): Returns the quotient of two integers (handles division by zero).
5.	fibonacci(int n): Computes the nth Fibonacci number.
6.	mean(double[] array): Calculates the average of an array.
7.	variance(double[] array): Computes the variance of an array.
