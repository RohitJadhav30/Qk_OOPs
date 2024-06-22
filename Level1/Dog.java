public class Dog {
    String breed;
    int age;
    double weight;

    Dog(String breed, int age, double weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateAge(){
        return age * 7;
    }

    public void printDog(){
        System.out.println("The bread of the dog is " + breed);
        System.out.println("Age of the dog in human years is "+ calculateAge() + " and the weight of the dog is " + weight + " kg");
    }

    public static void main(String[] args) {
        Dog d = new Dog("Pitbull", 2, 65.0);
        d.printDog();
    }


}
