
public class Main {

    public static Employee employees[] = new Employee[10];

    public static void main(String[] args) {


        Employee employee1 = new Employee("Ivan", "Ivanov", "Ivanovichd", 1, 40000);
        Employee employee2 = new Employee("Roman", "Romanov", "Romanovich", 2, 36000);
        Employee employee3 = new Employee("Oleg", "Olegov", "Olegovich", 3, 37000);


        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        System.out.println(allEmployee(employees));
        System.out.println("Общая стоимость зарплаты " + allSalary(employees) + " рублей");
        System.out.println(minSalary(employees));
        System.out.println(maxSalary(employees));
        System.out.println("Средня стоимость зарплаты " + allSalary(employees) / allEmployeers(employees)  + " рублей");
        System.out.println(allEmpl(employees));


    }
    public static String allEmployee(Employee[] employee) {
        for (Employee i : employee
        ) {
            if (i != null) {
                System.out.println(i.toString());
            }
        }
        return "";
    }
    public static String allEmpl(Employee[] employee) {
        for (Employee e : employee
        ) {
            if (e != null) {
                System.out.println(e.toString1());
            }
        }
        return "";
    }
    public static int allSalary(Employee[] sal) {
        int sum = 0;
        for (Employee i : sal) {
            if (i != null) {
                sum+=i.getSalary();
            }
        }
        return sum;
    }
    public static String minSalary(Employee[] employee) {
        int min=0;
        int idEmployee=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                min = (int) employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                if (employees[i].getSalary() < min){
                    min = (int) employees[i].getSalary();
                    idEmployee = i;
                }
            }
        }
        return "Сотрудник с минимальной зарплатой " + employee[idEmployee];
    }
    public static String maxSalary(Employee[] employee) {
        int max=0;
        int idEmployee=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                if (employees[i].getSalary() > max){
                    max = (int) employees[i].getSalary();
                    idEmployee = i;
                }
            }
        }
        return "Сотрудник с максималной зарплатой " + employee[idEmployee];
    }
    public static int allEmployeers(Employee[] employee) {
        int num = 0;
        for (Employee i : employee) {
            if (i != null) {
                num++;
            }
        }
        return num;
    }
}
