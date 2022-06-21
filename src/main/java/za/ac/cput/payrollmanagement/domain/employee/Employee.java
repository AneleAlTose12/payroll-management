package za.ac.cput.payrollmanagement.domain.employee;

import java.util.Objects;

public class Employee {
    private final String employeeNumber, firstName, middleName, lastName;
    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
    public static class Builder{
        private String employeeNumber, firstName, middleName, lastName;

        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            this.firstName = employee.firstName;
            this.middleName = employee.middleName;
            this.lastName = employee.lastName;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
        public static class EmployeeId{
            private String employeeNumber, employeeId;

            public EmployeeId(String employeeNumber, String employeeId){
                this.employeeNumber = employeeNumber;
                this.employeeId = employeeId;
            }
            public String getEmployeeNumber(){
                return employeeNumber;
            }
            public String getEmployeeId(){
                return employeeId;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EmployeeId that = (EmployeeId) o;
                return employeeNumber.equals(that.employeeNumber) &&
                        employeeId.equals(that.employeeId);
            }
            @Override
            public int hashCode() {
                return Objects.hash(employeeNumber, employeeId);
            }
        }

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNumber.equals(employee.employeeNumber);
    }
    @Override
    public int hashCode(){
        return Objects.hash(employeeNumber);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
