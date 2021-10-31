package com.lesson5;

public class ApplicationLauncher {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Name1", "Position 1", "employee_1@gmail.com", 111111111, 10000.00, 24);
        Employee employee2 = new Employee("Name2", "Position 2", "employee_2@gmail.com", 222222222, 20000.00, 35);
        Employee employee3 = new Employee("Name3", "Position 3", "employee_3@gmail.com", 333333333, 30000.00, 46);
        Employee employee4 = new Employee("Name4", "Position 4", "employee_4@gmail.com", 444444444, 40000.00, 57);
        Employee employee5 = new Employee("Name5", "Position 5", "employee_5@gmail.com", 555555555, 50000.00, 68);

        Employee[] employees = new Employee[5];

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }

}
