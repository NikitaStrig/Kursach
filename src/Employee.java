public class Employee {
    private String name;
    private double salary;
    private int department;
    private int id;
    static int count = 1;


    public Employee(String name, double salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = count;
        count++;

    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID " + getId() + " Name: " + getName() + " Salary: " + getSalary() + " Department: " + getDepartment();
    }

    }






