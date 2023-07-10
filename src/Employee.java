import java.util.List;

public class Employee {

    private String fio;
    private String position;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + ", должность: " + position + ", телефон: " +
                phone + ", зарплата: " + salary + ", возраст: " + age;
    }

    /*Написать функцию выводящую всю доступную информацию об объекте с использованием форматирования
    строк.*/

    public void getInfo() {
        System.out.printf("ФИО: %s, должность: %s, телефон: %s, зарплата: %d, возраст: %d.", fio, position, phone, salary, age);
    }

    public static float averageAge(Employee[] employeeArray) {
        float averageAge = 0f;
        for (Employee e : employeeArray) {
            averageAge += e.getAge();
        }
        return averageAge / employeeArray.length;
    }

    public static float averageSalary(Employee[] employeeArray) {
        float averageSalary = 0;
        for (Employee e : employeeArray) {
            averageSalary += e.getSalary();
        }
        return averageSalary / employeeArray.length;
    }
}
