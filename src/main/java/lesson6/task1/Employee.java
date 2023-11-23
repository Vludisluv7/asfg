package lesson6.task1;

class Employee {
    private String name;
    private String address;

    public void calculateSalary() {
        // Расчет зарплаты сотрудника
    }
}
// разделяем EmployeeRepository и Employee, используя первый принцип
class EmployeeRepository {
    public void saveEmployeeData(Employee employee) {
        // Сохранение данных сотрудника в базу данных
    }
}