package za.ac.cput.payrollmanagement.factory.employee;

import org.junit.jupiter.api.*;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeAddressFactoryTest {
    @Test
    public void buildWithSuccess(){
        EmployeeAddress employeeAddress = EmployeeAddressFactory
                .build("fghj", "dfghjhgf", "CPUT IN CAPE TOWN");
        System.out.println(employeeAddress);
        assertNotNull(employeeAddress);
    }
    @Test
    public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                EmployeeAddressFactory
                        .build(null, "dfghjhgf", "CPUT IN CAPE TOWN"));

        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("employee number is required!", exceptionMessage);
    }

}