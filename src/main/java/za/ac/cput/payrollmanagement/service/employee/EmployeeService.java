package za.ac.cput.payrollmanagement.service.employee;

import za.ac.cput.payrollmanagement.domain.employee.Employee;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.service.IService;

import java.util.List;

public interface EmployeeService extends IService<Employee, Employee/**.EmployeeId**/> {
    List<Employee> findByEmployeeNumber(String employeeNumber);
}
