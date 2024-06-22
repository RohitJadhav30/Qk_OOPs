// 3. Java Program to create an Area of triangle and rectangle and Passing and Returning Objects in Java
//    Explanation:
// Enter length and breadth of the rectangle as input. After that we create an object of that class and pass the reference variable to two different methods. Now we calculate the area for two different objects and return them to the main method. Hence we get two different areas as output.
package Level2;

class Triangle{
    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double calculateArea(){
        return 0.5 * base * height;
    }

    
}
class Rectangle{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        return length * breadth;
    }
}

public class Shape{
    public static void main(String[] args) {
        Triangle tri = new Triangle(10, 5);
        tri.calculateArea();

        Rectangle rec = new Rectangle(10, 10);

        System.out.println("The area of the triangle is: " + tri.calculateArea());
        System.out.println("The area of  the rectangle is: " + rec.calculateArea());
    }   
}
