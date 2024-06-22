// Write a Java program to create a class called "Furniture" with instance variables "type," "material," and "price." Include a method to calculate the discount on the furniture based on its material and a method to print the furniture's type, material, and discounted price.
class Household{
    String type;
    String material;
    double price;

    Household(String type, String material, double price){
        this.type = type;
        this.material = material;
        this.price = price;
    }

    double discount = 0.0;
    public double calculateDiscount(){
        if(material == "wood"){
            discount = 0.10;
        }
        else if(material == "steel"){
            discount = 0.12;
        }
        else if(material == "Glass"){
            discount = 0.15;
        }
        return price * (1 - discount);
    }

    public void displayFurniture(){
        double discountedPrice = calculateDiscount();
        System.out.println("The type of the furniture is " + type);
        System.out.println("Orignal price " + price);
        System.out.println("The material used in the furniture is " + material + " and the discounted price is " + discountedPrice);
    }
}

public class Furniture{
    public static void main(String[] args) {
        Household h = new Household("chair", "wood", 700);
        h.displayFurniture();
    }
}
