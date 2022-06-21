package za.ac.cput.payrollmanagement.factory.employee;

import za.ac.cput.payrollmanagement.domain.employee.Employee;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class EmployeeFactory {
    public static Employee build(String employeeNumber, String firstName, String middleName, String lastName){
        StringHelper.checkStringParam("employeeNumber", employeeNumber);
        StringHelper.checkStringParam("firstName", firstName);
        StringHelper.checkStringParam("lastName", lastName);
        middleName = StringHelper.setEmptyIfNull(middleName);
        return new Employee.Builder().employeeNumber(employeeNumber)
                .firstName(firstName).middleName(middleName)
                .lastName(lastName).build();
    }
}
