// 5. Java Program to Calculate Sum of Two Byte Values using Type Casting
//    Explanation: This is a Java Program to Calculate Sum of Two Byte Values Using Type Casting. Type casting in Java is to cast one type, a class or interface, into another type i.e. another class or interface.
// Enter any two byte values as input. After that we first convert these two bytes into integers using type casting and then we add those values and get the desired output.
package Level2;

import java.util.Scanner;

public class Addition {

    public static int calculateSum(byte num1, byte num2){
        int addition = num1 + num2;
        return addition;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        byte num1 = sc.nextByte();

        System.out.print("Enter the second number: ");
        byte num2 = sc.nextByte();

        int addition = calculateSum(num1, num2);
        System.err.println("the addition is: " + addition);
        sc.close();
    }
}
