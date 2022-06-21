package za.ac.cput.payrollmanagement.service.employee.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeGender;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeAddressFactory;
import za.ac.cput.payrollmanagement.service.employee.EmployeeAddressService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressServiceImplTest {
    private EmployeeAddress employeeAddress;
    private EmployeeAddress.EmployeeAddressId employeeAddressId;
    private EmployeeAddressService service;

    @BeforeEach
    void setUp(){
        this.employeeAddress = EmployeeAddressFactory
                .build("test-emp-number", "test-address-type",
                        "test-address-service");
        this.employeeAddressId = EmployeeAddressFactory.buildId(this.employeeAddress);
        this.service = EmployeeAddressServiceImpl.getService();
        EmployeeAddress saved = this.service.save(this.employeeAddress);
        assertAll(
                () -> assertNotNull(saved),
                () -> assertEquals(this.employeeAddress, saved)
        );
    }

    @AfterEach
    void tearDown(){
        this.service.delete(this.employeeAddress);
    }

    @Test
    void read() {
        Optional<EmployeeAddress> read = this.service.read(this.employeeAddressId);
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.employeeAddress, read.get())
        );
    }

    @Test
    void findByEmployeeNumber() {
        String employeeNumber = this.employeeAddressId.getEmployeeNumber();
         List<EmployeeAddress> employeeAddressList =
                this.service.findByEmployeeNumber(employeeNumber);
        System.out.println(employeeAddressList);
        assertSame(1, employeeAddressList.size());
    }
}