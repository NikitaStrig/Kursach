public class Main {

    public static void main(String[] args) {
        Employee[] mass = new Employee[10];
        int numberDepartment = 2;
        mass[0] = new Employee("Ivanov Ivan Ivanovich", 35000, 1);
        mass[1] = new Employee("Petrov Sergey Stepanovich", 45000, 2);
        mass[2] = new Employee("Zuzin Ivan Ivanovich", 64000, 1);
        mass[3] = new Employee("Tuzin Petr Ivanovich", 90000, 3);
        mass[4] = new Employee("Kostin Nikita Petrovich", 159000, 5);
        mass[5] = new Employee("Shastik Sergey Ivanovich", 100000, 2);
        System.out.println("Полный список сотрудников:");
        System.out.println(Employee.allPrint(mass));
        System.out.println(" ");
        System.out.println("Сумма затрта на зарплаты все сотрудникам за месяц - " +  Employee.fullSalary(mass));
        System.out.println(" ");
        System.out.println(Employee.minSalary(mass) + " - данный сотрудник имеет наименьшию зарплату из всем отделах");
        System.out.println(" ");
        System.out.println(Employee.maxSalary(mass) + " - данный сотрудник имеет наибольшую зарплату из всем отделах");
        System.out.println(" ");
        System.out.println("Среднее значения заплаты по все отделам - " + Employee.countSalary(mass));
        System.out.println(" ");
        System.out.println("Список сотрудников: ");
        System.out.println(Employee.allNamePersonal(mass));
        System.out.println(" ");
        System.out.println("------Усложнение-----");
        System.out.println(Employee.minSalaryDepartment(mass, numberDepartment) +
                " - данный сотрудник имеет наименьшию зарплату в отделе " + numberDepartment);
        System.out.println(" ");
        System.out.println(Employee.maxSalaryDepartment(mass, numberDepartment) +
                " - данный сотрудник имеет наибольшую зарплату в отделе " + numberDepartment);


    }
}