package za.ac.cput.payrollmanagement.factory.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeContact;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class EmployeeContactFactory {
    public static EmployeeContact build(String employeeNumber, String contactTypeId, String contact){
        StringHelper.checkStringParam("employeeNumber", employeeNumber);
        StringHelper.checkStringParam("contactTypeId", contactTypeId);
        StringHelper.checkStringParam("contact", contact);
        return new EmployeeContact.Builder().employeeNumber(employeeNumber)
                .contactTypeId(contactTypeId).contact(contact).build();

    }
    public static EmployeeContact.EmployeeContactId buildId(EmployeeContact employeeContact){
        return new EmployeeContact.EmployeeContactId(employeeContact.getEmployeeNumber(),
                employeeContact.getContactTypeId());
    }
}
