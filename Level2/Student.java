// 2. Java Program to Count Number of Objects Created for Class
//    Explanation:Whenever an object is made of a class, its constructor is invoked. Whenever the constructor runs we increment the counter value. Hence the number of objects created of a class equals the counter value
package Level2;

public class Student{
    String name;
    int id;
    private static int count = 0;

    Student(String name, int id){
        this.name = name;
        this.id = id;
        count++;
    }

    public void display(){
        System.out.println("Name of the student is: " + name + " and id: " + id);
    }

    public static int getCount(){
        return count;
    }

    
    

    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 1);
        

        s1.display();
        Student s2 = new Student("Akash", 2);
        s2.display();

        System.out.println(Student.getCount());
        
    }
}
