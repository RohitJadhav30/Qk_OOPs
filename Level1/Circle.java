public class Circle {
    double area;
    double circumference;
    float radius;

    Circle(float radius){
        this.radius = radius;
    }

    public void calculateArea(){
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("the area of the circle is: " + String.format("%.2f", area));
    }

    public void calculateCircumference(){
        circumference = 2 * Math.PI * radius;
        System.out.println("the circumference of the circle is: " + String.format("%.2f", circumference));

    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();
        c.calculateCircumference();
    }
}
