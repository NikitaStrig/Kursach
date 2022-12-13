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



    public static int fullSalary(Employee[] mass) {
        int i;
        int full = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            full = full + mass[i].getSalary() * 31;
        }
        return full;
    }

    public static int countSalary(Employee[] mass) {
        int i;
        int count = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            count = (count + mass[i].getSalary() * 31) / mass.length;
        }
        return count;
    }
    public static Employee allPrint(Employee[] mass){
        int i;
        for (i = 0; i < mass.length-1;  i++) {
            if (mass[i] != null){
                System.out.println(mass[i]);
            }
        }
        return mass[i];
    }
    public static String minSalary(Employee[] mass){
        int i;
        int min = mass[0].getSalary();
        String name = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getSalary() <= min){
                name = mass[i].getName();
            }
        }
        return name;
    }
    public static String maxSalary(Employee[] mass){
        int i;
        int max = mass[0].getSalary();
        String name = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getSalary() >= max){
                name = mass[i].getName();
            }
        }
        return name;
    }
    public  static  String allNamePersonal(Employee[] mass){
        int i;
        String allName = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            allName = allName + mass[i].getName() + "\n";

        }
        return allName;
    }
    ////////
    public static String minSalaryDepartment(Employee[] mass, int number){
        int i;
        String name = "";
        int min = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number) {
                min = mass[i].getSalary();
            }
        }
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number && mass[i].getSalary() <= min) {
                min = mass[i].getSalary();
                name = mass[i].getName();
            }
        }

        return name;
    }
    public static String maxSalaryDepartment(Employee[] mass, int number){
        int i;
        int j;
        String name = "";
        int min = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number) {
                min = mass[i].getSalary();
            }
        }
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number && mass[i].getSalary() >= min) {
                min = mass[i].getSalary();
                name = mass[i].getName();
            }
        }

        return name;
    }




}



