package za.ac.cput.payrollmanagement.service.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeGender;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.service.IService;

import java.util.List;

public interface EmployeeGenderService extends IService<EmployeeGender, EmployeeGender.EmployeeGenderId> {
    List<EmployeeGender> findByEmployeeNumber(String employeeNumber);
}
