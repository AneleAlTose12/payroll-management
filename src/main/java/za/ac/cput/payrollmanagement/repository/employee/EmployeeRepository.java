package za.ac.cput.payrollmanagement.repository.employee;

import za.ac.cput.payrollmanagement.domain.employee.Employee;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.repository.IRepository;

import java.util.List;

public interface EmployeeRepository /**extends IRepository<Employee, Employee.EmployeeId>**/ {
    List<Employee> findByEmployeeNumber(String employeeNumber);
}
