public class Phone {
    String maker;
    String model;
    int storage;

    Phone(String maker, String model, int storage){
        this.maker = maker;
        this.model = model;
        this.storage = storage;
    }

    double price;

    public double calculatePrice(){
        double basePrice = 1000;

        if(maker == "apple"){
            basePrice += 1000;
        }
        else if(maker == "Samsung"){
            basePrice += 800;
        }
        else{
            basePrice += 500;
        }

        if(model == "pro"){
            basePrice += 500;
        }
        else if(model == "plus"){
            basePrice += 300;
        }
        else{
            basePrice += 200;
        }

        if(storage == 256){
            basePrice += 100;
        }
        else if(storage == 128){
            basePrice += 60;
        }
        else{
            basePrice += 40;
        }



        return basePrice;
    }

    public void displayPhone(){
        System.out.println("The maker of the phone is " + maker);
        System.out.println("the model of the phone is " + model + " and the storage of the phone is " + storage + "gb");
        System.out.println("The price of the phone is " + calculatePrice());
    }

    public static void main(String[] args) {
        Phone phone = new Phone("apple", "plus", 256);
        phone.displayPhone();
    }
}
