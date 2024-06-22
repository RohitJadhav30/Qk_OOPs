// Write a Java program to create a class called "Shirt" with instance variables "size," "color," and "price." Include a method to calculate the discount on the shirt with instance variables "size," "color," and "price." Include a method to calculate the discount on the shirt based on  its size and a method to print the shirt's size, color, and discounted price
public class Shirt {
    String size;
    String color;
    double price;

    Shirt(String size, String color, double price){
        this.size = size;
        this.color = color;
        this.price = price;
    }

    double discount;
    public double calculateDiscount(){
        if(size == "s"){
            discount = 0.5;
        }
        else if(size == "M"){
            discount = 0.8;
        }
        else if(size == "l"){
            discount = 0.10;
        }
        else if(size == "xl"){
            discount = 0.15;
        }
        return price * (1 - discount);
    }

    public void displayShirt(){
        double discountedPrice = calculateDiscount();
        System.out.println("The size of the shirt is " + size);
        System.out.println("The color of the shirt is "+ color + " and the discounted price of the shirt is " + String.format("%.2f", discountedPrice));
    }

    public static void main(String[] args) {
        Shirt shirt = new Shirt("M", "Black", 800);
        shirt.displayShirt();
    }  
}
