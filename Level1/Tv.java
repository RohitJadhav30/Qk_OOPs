public class Tv {
    String brand;
    double size;
    double price;

    Tv(String brand, double size, double price){
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    double discount;
    public double calculateDiscount(){
        if(size <= 32){
            discount = 0.10;
        }
        else if(size >32 && size <= 55){
            discount = 0.15;
        }
        else if(size > 55){
            discount = 0.20;
        }
        return price * discount;
    }

    public void dispalyTV(){
        System.out.println("the brand of the tv is " + brand + " ,the size of the tv is " + size + " and the discount on the tv is " + calculateDiscount());
    }

    public static void main(String[] args) {
        Tv tv = new Tv("samsung", 55, 55000);
        tv.dispalyTV();
    }
    
}
