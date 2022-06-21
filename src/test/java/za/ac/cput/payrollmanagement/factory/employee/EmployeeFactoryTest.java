package za.ac.cput.payrollmanagement.factory.employee;

import org.junit.jupiter.api.Test;
import za.ac.cput.payrollmanagement.domain.employee.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    @Test
    void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                EmployeeFactory.build("", "", "", ""));
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("employeeNumber"));
    }
    @Test
    void buildWithSuccess(){
        Employee employee = EmployeeFactory
                .build("test-number", "test-first-name", null, "test-last-name");
        System.out.println(employee);
        assertAll(
                () -> assertNotNull(employee),
                () -> assertNotNull(employee.getMiddleName())
        );

    }

}