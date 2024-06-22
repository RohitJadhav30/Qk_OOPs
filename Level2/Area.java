package Level2;

public class Area {
    public double calculateArea(int side){
        return side * side;
    }

    public double calculateArea(double length, double width){
        return length * width;
    }

    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Area ar = new Area();
        double square = ar.calculateArea(5);
        System.out.println("Area of the square: " + square);

        double rectangle = ar.calculateArea(5, 6);
        System.out.println("Area of the reactangle is: " + rectangle);

        double circle = ar.calculateArea(5);
        System.out.println("Area of the circle is: " + circle);
    }
}
