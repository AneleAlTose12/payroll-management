package za.ac.cput.payrollmanagement.repository.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeGender;
import za.ac.cput.payrollmanagement.repository.IRepository;

import java.util.List;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, EmployeeGender.EmployeeGenderId> {
    List<EmployeeGender> findByEmployeeNumber(String employeeNumber);
}
