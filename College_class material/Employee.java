class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Worker extends Employee {
    private int hoursWorked;
    private int salaryPerHour;

    public Worker(String name, int age, int hoursWorked, int salaryPerHour) {
        super(name, age);
        this.hoursWorked = hoursWorked;
        this.salaryPerHour = salaryPerHour;
    }

    public int calculateTotalSalary() {
        return hoursWorked * salaryPerHour;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary Per Hour: " + salaryPerHour);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

class Manager extends Employee {
    private String department;
    private int salary;

    public Manager(String name, int age, String department, int salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("John Doe", 30, 40, 20);
        Manager manager = new Manager("Jane Smith", 45, "HR", 5000);

        System.out.println("Worker Details:");
        worker.display();

        System.out.println("\nManager Details:");
        manager.display();
    }
}
