package za.ac.cput.payrollmanagement.factory.employee;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class EmployeeAddressFactory {
    public static EmployeeAddress build(String employeeNumber, String addressTypeId, String address){
        StringHelper.checkStringParam("employeeNumber", employeeNumber);
        StringHelper.checkStringParam("addressTypeId", addressTypeId);
        StringHelper.checkStringParam("address", address);
        return new EmployeeAddress.Builder().employeeNumber(employeeNumber)
                .addressTypeId(addressTypeId).address(address).build();
    }
    public static EmployeeAddress.EmployeeAddressId buildId(EmployeeAddress employeeAddress){
        return new EmployeeAddress.EmployeeAddressId(employeeAddress.getEmployeeNumber(),
                employeeAddress.getAddressTypeId());
    }

}