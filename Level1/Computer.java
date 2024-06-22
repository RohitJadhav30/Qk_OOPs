// Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and "storage." Include a method to calculate the price of the computer based on the processor, RAM, and storage capacity and a method to print the computer's processor, RAM, and storage capacity.
class Specification{
    String processor;
    int ram;
    int storage;

    Specification(String processor, int ram, int storage){
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    double price;
    public double calculatePrice(){
        double basePrice = 20000;

        if(processor == "Rayzon"){
            price = basePrice + 10000;
        }
        else if(processor == "nvidia"){
            price = basePrice + 15000;
        }
        else{
            price = basePrice + 20000;
        }

        if(ram == 8 && storage == 512){
            price = price + 5000;
        }
        else if(ram == 12 && storage == 512){
            price = price + 800;
        }
        else if(ram == 12 && storage == 1024){
            price = price + 1000;
        }

        return price;
    }

    public void displayComputer(){
        System.out.println("The processor of the computer is " + processor);
        System.out.println("The RAM of the computer is " + ram + " and the storage of the computer is " + storage);
    }
}

public class Computer{
    public static void main(String[] args) {
        Specification specs = new Specification("Rayzon", 12, 512);
        double totalPrice = specs.calculatePrice();
        System.out.println("The price of the computer is " + totalPrice);
        specs.displayComputer();
    }
}

