public class Employee {
    private String fio;
    private int department;
    private float salary;
    private final int counter; // почему счётчик работает только при final
    private static int id=1;
    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.counter = id++;
    }
    public int getCounter() {
        return this.getCounter();
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
        return "ФИО: " + this.fio + ", отдел: " + this.department + ", зарплата: " + this.salary + " ID: " + counter;
    }
}