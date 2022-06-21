package za.ac.cput.payrollmanagement.repository.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeContact;
import za.ac.cput.payrollmanagement.repository.IRepository;

import java.util.List;

public interface EmployeeAddressRepository extends IRepository<EmployeeAddress, EmployeeAddress.EmployeeAddressId> {
    List<EmployeeAddress> findByEmployeeNumber(String employeeNumber);
}
