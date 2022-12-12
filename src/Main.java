public class Main {

    public static void main(String[] args) {
        int min = 0;
        Employee[] mass = new Employee[10];
        mass[0] = new Employee("Ivanov Ivan Ivanovich", 35000, 1);
        mass[1] = new Employee("Penrov Sergey Stepanovich", 45000, 2);
        mass[2] = new Employee("Zuzin Ivan Ivanovich", 64000, 1);
        mass[3] = new Employee("Tuzin Petr Ivanovich", 90000, 3);
        mass[4] = new Employee("Kostin Nikita Petrovich", 159000, 5);
        mass[5] = new Employee("Shastik Sergey Ivanovich", 100000, 2);
        System.out.println(Employee.allPrint(mass));
 //       System.out.println(Employee.minSalary(mass,));




    }}