package pro.sky.Employeeshomework.Exceptions;

public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException (String message) {
        super(message);
    }
}
