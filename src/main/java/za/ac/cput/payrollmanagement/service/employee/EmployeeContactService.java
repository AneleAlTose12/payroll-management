package za.ac.cput.payrollmanagement.service.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeContact;
import za.ac.cput.payrollmanagement.service.IService;

import java.util.List;

public interface EmployeeContactService extends IService<EmployeeContact, EmployeeContact.EmployeeContactId> {
    List<EmployeeContact> findByEmployeeNumber(String employeeNumber);
}
