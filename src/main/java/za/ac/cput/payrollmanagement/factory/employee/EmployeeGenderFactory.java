package za.ac.cput.payrollmanagement.factory.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeGender;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class EmployeeGenderFactory {
    public static EmployeeGender build(String employeeNumber, String genderId){
        StringHelper.checkStringParam("employeeNumber", employeeNumber);
        StringHelper.checkStringParam("gendeId", genderId);
        //StringHelper.checkStringParam("gender", gender);
        return new EmployeeGender.Builder().employeeNumber(employeeNumber)
                .genderId(genderId).build();
    }
    public static EmployeeGender.EmployeeGenderId buildId(EmployeeGender employeeGender){
        return new EmployeeGender.EmployeeGenderId(employeeGender.getEmployeeNumber(),
                employeeGender.getGenderId());
    }

}
