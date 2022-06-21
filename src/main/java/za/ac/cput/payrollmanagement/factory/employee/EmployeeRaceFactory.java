package za.ac.cput.payrollmanagement.factory.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeGender;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeRace;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class EmployeeRaceFactory {
    public static EmployeeRace build(String employeeNumber, String raceId){
        StringHelper.checkStringParam("employeeNumber", employeeNumber);
        StringHelper.checkStringParam("raceId", raceId);
        return new EmployeeRace.Builder().employeeNumber(employeeNumber)
                .raceId(raceId).build();
    }
    public static EmployeeRace.EmployeeRaceId buildId(EmployeeRace employeeRace){
        return new EmployeeRace.EmployeeRaceId(employeeRace.getEmployeeNumber(),
                employeeRace.getRaceId());
    }

}
