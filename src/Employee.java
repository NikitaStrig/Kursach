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


    public static double fullSalary(Employee[] mass) {
        int i;
        double full = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            full = full + mass[i].getSalary() * 31;
        }
        return full;
    }

    public static double avrSalary(Employee[] mass) {
        int i;
        double avr = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            avr = (avr + mass[i].getSalary()) / mass.length;
        }
        return avr;
    }

    public static String allPrint(Employee[] mass) {
        int i;
        String allPersonal = "";
        for (i = 0; i < mass.length - 1 && mass[i] != null; i++) {
            allPersonal = allPersonal + mass[i]+ "\n";
        }
        return allPersonal;
    }

    public static String minSalary(Employee[] mass) {
        int i;
        double min = mass[0].getSalary();
        String name = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getSalary() <= min) {
                name = mass[i].getName();
            }
        }
        return name;
    }

    public static String maxSalary(Employee[] mass) {
        int i;
        double max = mass[0].getSalary();
        String name = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getSalary() >= max) {
                name = mass[i].getName();
            }
        }
        return name;
    }

    public static String allNamePersonal(Employee[] mass) {
        int i;
        String allName = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            allName = allName + mass[i].getName() + "\n";

        }
        return allName;
    }

    ////////
    public static Employee percentIndexingSalary(Employee[] mass, double percentIndexing) {
        int i;
        double resultIndexing;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            resultIndexing = mass[i].getSalary() * (percentIndexing / 100);
            resultIndexing = mass[i].getSalary() + resultIndexing;
            mass[i].setSalary(resultIndexing);
            System.out.println(mass[i].getName() + " " + mass[i].getSalary());

        }
        return mass[i];
    }

    public static String minSalaryDepartment(Employee[] mass, int number) {
        int i;
        String name = "";
        double min = 0;
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

    public static String maxSalaryDepartment(Employee[] mass, int number) {
        int i;
        String name = "";
        double min = 0;
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

    public static double fullSalaryDepartment(Employee[] mass, int number) {
        int i;
        double full = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number) {
                full = full + mass[i].getSalary();
            }
        }
        return full;
    }


    public static double avrSalaryDepartment(Employee[] mass, int number) {
        int i;
        int numberOfEmployees = 0;
        double full = 0;
        double avr = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number) {
                full = full + mass[i].getSalary();
                numberOfEmployees++;
                avr = full / numberOfEmployees;
            }
        }
        return avr;
    }
    public static String percentIndexingSalaryDepartment(Employee[] mass, int number, double percentIndexing) {
        int i;
        String personalDepartment = "";
        for (i = 0; i < mass.length  && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number) {
                personalDepartment = personalDepartment + mass[i].getName() + " "
                        + ((mass[i].getSalary() * (percentIndexing / 100)) + mass[i].getSalary()) + "\n";

            }

        }
        return personalDepartment;
    }

    public static String allPersonalDepartment(Employee[] mass, int number) {
        int i;
        String allPersonal = " ";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number) {
                allPersonal = allPersonal + "\n" + "ID " + mass[i].getId() + " Name: " + mass[i].getName()
                        + " Salary: " + mass[i].getSalary();

            }
        }
        return allPersonal;
    }

    //////
    public static String allPersonalUppNumber(Employee[] mass, double number) {
        int i;
        String allPersonalNunber = " ";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (number <= mass[i].getSalary()){
                allPersonalNunber = allPersonalNunber + "\n" + "ID " + mass[i].getId() + " Name: " + mass[i].getName()
                        + " Salary: " + mass[i].getSalary();
            }
        }
        return allPersonalNunber;
    }
    public static String allPersonalLowerNumber(Employee[] mass, double number) {
        int i;
        String allPersonalNunber = " ";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (number > mass[i].getSalary()){
                allPersonalNunber = allPersonalNunber + "\n" + "ID " + mass[i].getId() + " Name: " + mass[i].getName()
                        + " Salary: " + mass[i].getSalary();
            }
        }
        return allPersonalNunber;
    }
}





