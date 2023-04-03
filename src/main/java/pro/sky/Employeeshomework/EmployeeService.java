package pro.sky.Employeeshomework;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
   static Employee[] employees = new Employee[10];

   public static void main(String[] args) {
        employees[0] = new Employee("John Smith");
        employees[1] = new Employee("Tracy Smith");
        employees[2] = new Employee("Anna Kraft");
        employees[3] = new Employee("Luise Montpelier");
        employees[4] = new Employee("Abraham Kennedy");
        employees[5] = new Employee("Zu Tzu");
        employees[6] = new Employee("Fernandez Lao");
        employees[7] = new Employee("Lyubov Koroleva ");
        employees[8] = new Employee("Ivan Drozdov");
        employees[9] = new Employee("Sergey Smirnoff");
    }

    public void addEmployee (String fullName) {
      
    }
}
