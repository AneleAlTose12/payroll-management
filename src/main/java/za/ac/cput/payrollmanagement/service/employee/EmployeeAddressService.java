package za.ac.cput.payrollmanagement.service.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.service.IService;

import java.util.List;

public interface EmployeeAddressService extends IService<EmployeeAddress, EmployeeAddress.EmployeeAddressId> {
    List<EmployeeAddress> findByEmployeeNumber(String employeeNumber);
}
