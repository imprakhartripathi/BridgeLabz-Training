// Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
// Hint => 
    // Create a variable number1 and number2 and take user inputs.
// Perform Arithmetic Operations of addition, subtraction, multiplication, and division assign the result to a variable, and finally print the result
// I/P => number1, number2
// O/P => The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double number1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = sc.nextDouble();

            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division = number1 / number2;

            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                               + number1 + " and " + number2 + " is " 
                               + addition + ", " 
                               + subtraction + ", " 
                               + multiplication + ", and " 
                               + division);
            sc.close();
        }
    }
}
