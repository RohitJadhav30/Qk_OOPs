// 4.  Java Program to Show the Nesting of Methods
//    Explanation: Enter length, breadth and height as input. After that we first call the volume method. From the volume method we call the area method and from the area method we call perimeter method. Hence we get the perimeter, area and volume of the cuboid as output.
package Level2;

import java.util.Scanner;

public class Cuboid {
    double length, breadth, height;

    Cuboid(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height =  height;
    }

    public double calculatePerimeter(double length, double breadth, double height){
        double perimeter = 4 * (length + breadth + height);
        System.out.println("Perimeter = " + perimeter + " m");
        return perimeter;
    }

    public double calculateArea(double length, double breadth, double height){
        calculatePerimeter(length, breadth, height);

        double area = 2 * (length * breadth + breadth * height + height * length);
        System.out.println("area = " + area + " m^2");
        return area;
    }

    public double calculateVolume(double length, double breadth, double height){
        calculateArea(length, breadth, height);

        double volume = length * breadth * height;
        System.out.println("volume = " + volume + " m^3");
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = sc.nextInt();

        System.err.print("Enter the breadth: ");
        double breadth = sc.nextInt();

        System.err.print("Enter the height: ");
        double height = sc.nextInt();

        Cuboid cube = new Cuboid(length, breadth, height);
        cube.calculateVolume(length, breadth, height);

        sc.close();
    }

    
}
