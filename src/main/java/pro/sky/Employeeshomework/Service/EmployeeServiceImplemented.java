package pro.sky.Employeeshomework.Service;

import org.springframework.stereotype.Service;
import pro.sky.Employeeshomework.Employee;
import pro.sky.Employeeshomework.Exceptions.EmployeeAlreadyAddedException;
import pro.sky.Employeeshomework.Exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImplemented implements EmployeeService {
    private final ArrayList<Object> employeesList;

 public EmployeeServiceImplemented (List<Employee> employeeList) {
    this.employeesList = new ArrayList<>();
}
    @Override
    public Employee addEmployee(String firstname, String lastName) {
        Employee employee = new Employee(firstname, lastName);
        if (employeesList.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Such employee already exists");
        }
        employeesList.add(employee);
        return employee;
    }
    @Override
    public Employee removeEmployee(String firstname, String lastName) {
        Employee employee = new Employee(firstname, lastName);
        if (employeesList.contains(employee)) {
            employeesList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Employee findEmployee(String firstname, String lastName)  {
        Employee employee = new Employee(firstname, lastName);
        if (employeesList.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public List<Object> findAll() {
        return Collections.unmodifiableList(employeesList);
    }
}
