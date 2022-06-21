package za.ac.cput.payrollmanagement.service.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.service.IService;

import java.util.List;

public interface EmployeeRaceService extends IService<EmployeeIdentity, EmployeeIdentity.EmployeeIdentityId> {
    List<EmployeeIdentity> findByEmployeeNumber(String employeeNumber);
}
