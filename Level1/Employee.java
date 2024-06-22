public class Employee {
    String name;
    double monthlySalary;
    int id;

    Employee(String name, double monthlySalary, int id){
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.id = id;
    }

    double salary;
    public double calculateSalary(){
        salary = monthlySalary * 12;
        return salary;
    }

    public void printEmployee(){
        System.out.println("The name of the employee is: " + name + " and the yearly CTC of the employee is: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Raghav", 45000, 8);
        emp.calculateSalary();
        emp.printEmployee();
    }
}
