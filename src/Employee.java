public class Employee {
    private String firsName;
    private String midName;
    private String lastName;
    private int department;
    private double salary;
    private int id;
    static int count = 1;

    public Employee(String firsName, String midName, String lastName, int department, double salary) {
        this.firsName = firsName;
        this.midName = midName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        id = count;
            count++;
    }

    public String getFirsName() {
        return firsName;
    }
    public String getMidName() {
        return midName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник " + firsName + " " + midName + " " + lastName + ", отдел № " + department + ", зарплата " + salary + " рублей, id=" + id;
    }
}
