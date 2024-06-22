package Level2;

public class Arithmatic {

    public int sum(int num1, int num2){
        int add = num1 + num2;
        return add;
    }

    public int sum(int num1, int num2, int num3){
        int add = num1 + num2 + num3;
        return add;
    }

    public int sum(int num1, int num2, int num3, int num4){
        int add = num1 + num2 + num3 + num4;
        return add;
    }
    public static void main(String[] args) {
        Arithmatic ari = new Arithmatic();
        int sumofTwo = ari.sum(10, 20);
        System.out.println("Two number additon: " + sumofTwo);

        int sumOfThree = ari.sum(10, 20,30);
        System.out.println("Sum of three numbers: " + sumOfThree);

        int sumOfFour = ari.sum(10, 20, 30, 40);
        System.out.println("Sum of four numbers: " + sumOfFour);
        
    }
}
