package za.ac.cput.payrollmanagement.service.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeAddressRepository;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeIdentityRepository;
import za.ac.cput.payrollmanagement.repository.employee.impl.EmployeeAddressRepositoryImpl;
import za.ac.cput.payrollmanagement.repository.employee.impl.EmployeeIdentityRepositoryImpl;
import za.ac.cput.payrollmanagement.service.employee.EmployeeAddressService;
import za.ac.cput.payrollmanagement.service.employee.EmployeeIdentityService;

import java.util.List;
import java.util.Optional;

public class EmployeeAddressServiceImpl implements EmployeeAddressService {
    private final EmployeeAddressRepository repository;
    private static EmployeeAddressService SERVICE;

    private EmployeeAddressServiceImpl(){

        this.repository = EmployeeAddressRepositoryImpl.getRepository();
    }
    public static EmployeeAddressService getService(){
        if(SERVICE == null)
            SERVICE = new EmployeeAddressServiceImpl();
        return SERVICE;
    }

    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        return this.repository.save(employeeAddress);
    }

    @Override
    public Optional<EmployeeAddress> read(EmployeeAddress
                   .EmployeeAddressId employeeAddressId) {
        return this.repository.read(employeeAddressId);
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {
        this.repository.delete(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> findByEmployeeNumber(String employeeNumber) {
        return this.repository.findByEmployeeNumber(employeeNumber);
    }
}
