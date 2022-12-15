public class Main {
    public static String calculationFullCosts(Employee[] mass) {
        int i;
        double full = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            full = full + mass[i].getSalary() * 31;
        }
        String formattedDouble = String.format("%.3f", full);
        return formattedDouble;
    }

    public static String calculationAvrSalaryAll(Employee[] mass) {
        int i;
        double avr = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            avr = avr + mass[i].getSalary();
        }
        avr = avr / i;
        String formattedDouble = String.format("%.3f", avr);
        return formattedDouble;
    }

    public static String printAllEmployee(Employee[] mass) {
        int i;
        String allPersonal = "";
        for (i = 0; i < mass.length - 1 && mass[i] != null; i++) {
            allPersonal = allPersonal + mass[i] + "\n";
        }
        return allPersonal;
    }

    public static String searchMinSalary(Employee[] mass) {
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

    public static String searchMaxSalary(Employee[] mass) {
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

    public static String printAllNamePersonal(Employee[] mass) {
        int i;
        String allName = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            allName = allName + mass[i].getName() + "\n";

        }
        return allName;
    }

    ////////
    public static String indexingPercentSalary(Employee[] mass, double percentIndexing) {
        int i;
        double resultIndexing;
        String persolan = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            resultIndexing = mass[i].getSalary() * (percentIndexing / 100);
            resultIndexing = mass[i].getSalary() + resultIndexing;
            mass[i].setSalary(resultIndexing);
            persolan = persolan + mass[i].getName() + " " + mass[i].getSalary() + "\n";

        }
        return persolan;
    }

    public static String searchMinSalaryDepartment(Employee[] mass, int number) {
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

    public static String searchMaxSalaryDepartment(Employee[] mass, int number) {
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

    public static double calculationFullSalaryDepartment(Employee[] mass, int number) {
        int i;
        double full = 0;
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number) {
                full = full + mass[i].getSalary();
            }
        }
        return full;
    }


    public static double calculationAvrSalaryDepartment(Employee[] mass, int number) {
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

    public static String indexingPercentSalaryDepartment(Employee[] mass, int number, double percentIndexing) {
        int i;
        String personalDepartment = "";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (mass[i].getDepartment() == number) {
                personalDepartment = personalDepartment + mass[i].getName() + " "
                        + ((mass[i].getSalary() * (percentIndexing / 100)) + mass[i].getSalary()) + "\n";

            }

        }
        return personalDepartment;
    }

    public static String printAllPersonalDepartment(Employee[] mass, int number) {
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
    public static String searchAllPersonalUppNumber(Employee[] mass, double number) {
        int i;
        String allPersonalNunber = " ";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (number <= mass[i].getSalary()) {
                allPersonalNunber = allPersonalNunber + "\n" + "ID " + mass[i].getId() + " Name: " + mass[i].getName()
                        + " Salary: " + mass[i].getSalary();
            }
        }
        return allPersonalNunber;
    }

    public static String searchAllPersonalLowerNumber(Employee[] mass, double number) {
        int i;
        String allPersonalNunber = " ";
        for (i = 0; i < mass.length && mass[i] != null; i++) {
            if (number > mass[i].getSalary()) {
                allPersonalNunber = allPersonalNunber + "\n" + "ID " + mass[i].getId() + " Name: " + mass[i].getName()
                        + " Salary: " + mass[i].getSalary();
            }
        }
        return allPersonalNunber;
    }

        public static void main (String[]args){
            Employee[] mass = new Employee[10];
            int numberDepartment = 3;
            double percentIndexing = 8;
            double salaryTest = 50000;
            mass[0] = new Employee("Ivanov Ivan Ivanovich", 35000, 1);
            mass[1] = new Employee("Petrov Sergey Stepanovich", 45000, 2);
            mass[2] = new Employee("Zuzin Ivan Ivanovich", 50000, 1);
            mass[3] = new Employee("Tuzin Petr Ivanovich", 90000, 3);
            mass[4] = new Employee("Kostin Nikita Petrovich", 159000, 5);
            mass[5] = new Employee("Shastik Sergey Ivanovich", 100000, 2);
            mass[6] = new Employee("Lipki Alex Mars", 300000, 3);
            mass[7] = new Employee("Chai Alex Zloy", 120000, 5);
            mass[8] = new Employee("Panch David Aha", 500000, 4);

            System.out.println("Полный список сотрудников:");
            System.out.println(printAllEmployee(mass));

            System.out.println("Сумма затрат на зарплаты все сотрудникам за месяц - " + calculationFullCosts(mass));
            System.out.println(" ");

            System.out.println(searchMinSalary(mass) + " - данный сотрудник имеет наименьшию зарплату из всем отделах");
            System.out.println(" ");

            System.out.println(searchMaxSalary(mass) + " - данный сотрудник имеет наибольшую зарплату из всем отделах");
            System.out.println(" ");

            System.out.println("Среднее значения заплаты по все отделам - " + calculationAvrSalaryAll(mass));
            System.out.println(" ");

            System.out.println("Список сотрудников: ");
            System.out.println(printAllNamePersonal(mass));
            System.out.println(" ");

            System.out.println("------Усложнение-----");
            System.out.println(" ");

            System.out.println(searchMinSalaryDepartment(mass, numberDepartment) +
                    " - данный сотрудник имеет наименьшию зарплату в отделе " + numberDepartment);
            System.out.println(" ");

            System.out.println(searchMaxSalaryDepartment(mass, numberDepartment) +
                    " - данный сотрудник имеет наибольшую зарплату в отделе " + numberDepartment);
            System.out.println(" ");

            System.out.println("Сумма затрат на зарплату в отдел " + numberDepartment + " состовляет " +
                    calculationFullSalaryDepartment(mass, numberDepartment));
            System.out.println(" ");

            System.out.println("Среднее значения зарлаты в отделе " + numberDepartment + " состовляет "
                    + calculationAvrSalaryDepartment(mass, numberDepartment));
            System.out.println(" ");

            System.out.println("Список сотрудников отдела " + numberDepartment +
                    printAllPersonalDepartment(mass, numberDepartment));
            System.out.println(" ");

            System.out.println("Сотрудники, чьи зарплаты меньше " + salaryTest + ": " +
                    searchAllPersonalLowerNumber(mass, salaryTest));
            System.out.println(" ");

            System.out.println("Сотрудники, чьи зарплаты выше или равно " + salaryTest + ": " +
                    searchAllPersonalUppNumber(mass, salaryTest));
            System.out.println(" ");

            System.out.println("Зарплаты сотрудников с учетвм индексации в " + percentIndexing + "% ");
            System.out.println(indexingPercentSalary(mass, percentIndexing));
            System.out.println(" ");

            System.out.println("Зарплаты сотрудников из отдела " + numberDepartment + " с учетвм индексации в "
                    + percentIndexing + "% ");

            System.out.println(indexingPercentSalaryDepartment(mass, numberDepartment, percentIndexing));


        }


    }
