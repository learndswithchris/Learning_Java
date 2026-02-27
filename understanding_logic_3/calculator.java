package Learning_Java.understanding_logic_3;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        // Create Scanner to read user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===\n");

        // Get first number from user
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        // Get operator from user
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        // Get second number from user
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        double result = 0;
        boolean validOperation = true;

// Use switch to perform the operation and print the result
        switch (operator){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':

                // Handle division by zero!
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("\n--- Result ---");
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        // Close the Scanner
        input.close();
    }
}

