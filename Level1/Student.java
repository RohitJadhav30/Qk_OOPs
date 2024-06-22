
public class Student {
    String name;
    int age;
    int id;

    Student(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void printStudent(){
        System.out.println("The name of the student is: " + name + " and age of the student is: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student("Akash", 23, 5);

        s.printStudent();
        
    }
}
