import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Создать массив из 5 сотрудников. Массив должен быть сразу инициализирован.

        Employee employee1 = new Employee("Петров П.П.", "developer", "89995556677", 50000, 33);
        Employee employee2 = new Employee("Иванов И.И.", "fitter", "891555577788", 60000, 30);
        Employee employee3 = new Employee("Сидоров С.С.", "project manager", "89161112233", 40000, 28);
        Employee employee4 = new Employee("Тарасов Т.Т.", "senior developer", "89033336677", 80000, 35);
        Employee employee5 = new Employee("Чиж Ч.Ч.", "accountant", "89058887766", 70000, 46);
        Director director1 = new Director("Козлов А.Ю.", "director", "89993332211", 100000, 50);
        Employee[] employeeArray = {employee1, employee2, employee3, employee4, employee5, director1};
        for (Employee e : employeeArray) {
            System.out.println(e);
        }
        System.out.println();

        /*
        Опишите класс руководителя, наследник от сотрудника.
        Перенесите статический метод повышения зарплаты в класс руководителя,
        модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
        кроме руководителей. В основной программе создайте руководителя и поместите его
        в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
        чтобы зарплата руководителя не повысилась.
         */

        Director.addSalaryWithoutDirector(employeeArray, 34, 700);
        for (Employee e : employeeArray) {
            System.out.println(e);
        }
        System.out.println();

        /*
        Написать 2 класса компараторов по возрасту и зарплате (implements Comparator)
         */

        //Сортировка по зарплате

        System.out.println("Сортировка по зарплате");
        List<Employee> employeeList = Arrays.asList(employeeArray);
        employeeList.sort(new SalaryComparator());
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        System.out.println();

        //Сортировка по возрасту

        System.out.println("Сортировка по возрасту");
        employeeList.sort(new AgeComparator());
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}