package pro.sky.Employeeshomework;

import java.util.Objects;

public class Employee {
    private final String fullName;

    public Employee(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }


    @Override
    public String toString() {
        return "Full name: " + fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}
