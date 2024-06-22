// 1. Java Program to create a calculator and Return a Value from a Method.
//    Explanation:
//    We make a method named input which is used to get input from the user. We also make a method named add which is used to perform addition and return the result back to input method where we finally print the result.
package Level2;

import java.util.Scanner;

public class Calculator{
    int result = 0;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number to add: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number ");
        int num2 = sc.nextInt();
        result = add(num1, num2);
        System.out.println("addition = " + result);
        sc.close();
        
    }
    public int add(int num1, int num2){
        result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.input();
    }
}
