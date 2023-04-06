package pro.sky.Employeeshomework.Service;

import pro.sky.Employeeshomework.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(String firstname, String lastName);

    Employee removeEmployee(String firstname, String lastName);

    Employee findEmployee(String firstname, String lastName);

    List<Object> findAll();
}
