package za.ac.cput.payrollmanagement.repository.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeRace;
import za.ac.cput.payrollmanagement.repository.IRepository;

import java.util.List;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace, EmployeeRace.EmployeeRaceId> {
    List<EmployeeRace> findByEmployeeNumber(String employeeNumber);
}
