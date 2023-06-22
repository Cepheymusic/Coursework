public class Employee {
    private String fio;
    private int department;
    private float salary;
    private final int id;
    private static int counter=1;
    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }
    public int getId() {
        return this.getId();
    }
    public String getFio(){
        return this.fio;
    }
    public int getDepartment() {
        return this.department;
    }
    public float getSalary() {
        return this.salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String toString() {
        return "ФИО: " + this.fio + ", отдел: " + this.department + ", зарплата: " + this.salary + " ID: " + id;
    }
}