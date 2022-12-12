public class Employee {
    private String name;
    private int salary;
    private int department;
    private int id;
    static int count = 1;


    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = count;
        count++;

    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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

    public static Employee allPrint(Employee[] mass) {
        int i;
        for (i = 0; i < mass.length - 1; i++) {
            System.out.println(mass[i]);
        }
        return mass[i];

    }

    public static int minSalary(Employee[] massMin, Employee employee) {
        int i;
        int min = 0;
        for (i = 0; i < massMin.length; i++) {
            if (min > employee.salary) {
                min = employee.salary;
                System.out.println(min);
            }
        }
        return min;
    }


    public static void main(String[] args) {



    }
}
