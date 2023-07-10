public class Director extends Employee {

    public Director(String fio, String position, String phone, int salary, int age) {
        super(fio, position, phone, salary, age);
    }

    public static Employee[] addSalaryWithoutDirector(Employee[] employees, int age, int salaryPlus) {
        for (Employee e : employees) {
            if (e.getAge() > age & !(e instanceof Director)) {
                e.setSalary(e.getSalary() + salaryPlus);
            }
        }
        return employees;
    }
}
