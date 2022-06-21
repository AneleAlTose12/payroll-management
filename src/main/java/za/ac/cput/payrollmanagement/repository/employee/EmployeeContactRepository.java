package za.ac.cput.payrollmanagement.repository.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeContact;
import za.ac.cput.payrollmanagement.repository.IRepository;

import java.util.List;

public interface EmployeeContactRepository extends IRepository<EmployeeContact, EmployeeContact.EmployeeContactId> {
    List<EmployeeContact> findByEmployeeNumber(String employeeNumber);
}
