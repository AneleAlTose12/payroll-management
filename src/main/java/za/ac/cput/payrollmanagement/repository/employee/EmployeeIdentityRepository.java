package za.ac.cput.payrollmanagement.repository.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.repository.IRepository;

import java.util.List;

public interface EmployeeIdentityRepository extends IRepository<EmployeeIdentity,EmployeeIdentity.EmployeeIdentityId> {
    List<EmployeeIdentity> findByEmployeeNumber(String employeeNumber);
}
