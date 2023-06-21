public class Main {
    private static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Конин Андрей Петрович", 1, 35000.85f);
        employee[1] = new Employee("Понин Сергей Петрович", 2, 38458.75f);
        employee[2] = new Employee("Донин Пётр Петрович", 3, 85444.35f);
        employee[3] = new Employee("Ронин Антон Петрович", 5, 14544.45f);
        employee[4] = new Employee("Хонин Максим Петрович", 2, 15555.75f);
        employee[5] = new Employee("Бонин Александр Петрович", 4, 48959.85f);
        employee[6] = new Employee("Вонин Дмитрий Петрович", 5, 88546.34f);
        employee[7] = new Employee("Фонин Анатолий Петрович", 4, 28566.86f);
        employee[8] = new Employee("Жонин Иван Петрович", 2, 22322.59f);
        employee[9] = new Employee("Шонин Марк Петрович", 1, 66555.74f);
        informationEmployee();
        totalSalary();
        minSalary();
        maxSalary();
        listOfEmployees();
    }
    public static void informationEmployee() {
        for (Employee i : employee) {
            System.out.println(i);
        }
    }
    public static void totalSalary() {
        float sum = 0f;
        float averageSalary = 0;
        for (int i1 = 0; i1 < employee.length; i1++) {
            sum += employee[i1].getSalary();
            averageSalary = sum / employee.length;
        }
        System.out.println(sum);
        System.out.println(averageSalary);
    }
    public static void minSalary() {
        Employee min = employee[0];
        for (int i1 = 0; i1 < employee.length; i1++) {
            if (employee[i1].getSalary() < min.getSalary()) {
                min = employee[i1];
            }
        }
        System.out.println(min.getFio());
    }
    public static void maxSalary() {
        Employee max = employee[0];
        for (int i1 = 0; i1 < employee.length; i1++) {
            if (employee[i1].getSalary() > max.getSalary()) {
                max = employee[i1];
            }
        }
        System.out.println(max.getFio());
    }
    public static void listOfEmployees() {
                for (int i1 = 0; i1 < employee.length; i1++) {
                    System.out.println(employee[i1].getFio());
        }
    }
}