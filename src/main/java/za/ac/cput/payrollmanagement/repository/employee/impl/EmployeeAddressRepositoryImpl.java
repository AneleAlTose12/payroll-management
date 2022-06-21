package za.ac.cput.payrollmanagement.repository.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeContact;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeAddressFactory;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeContactFactory;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeAddressRepository;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeContactRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeAddressRepositoryImpl implements EmployeeAddressRepository {
    private final List<EmployeeAddress> employeeAddressList;
    //This is how to implement singlethon
    private static EmployeeAddressRepository EMPLOYEE_ADDRESS_REPOSITORY;

    private EmployeeAddressRepositoryImpl(){
        this.employeeAddressList = new ArrayList<>();
    }

    public static EmployeeAddressRepository getRepository(){
        if(EMPLOYEE_ADDRESS_REPOSITORY == null)
            EMPLOYEE_ADDRESS_REPOSITORY = new EmployeeAddressRepositoryImpl();
        return EMPLOYEE_ADDRESS_REPOSITORY;
    }
    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress){
        EmployeeAddress.EmployeeAddressId employeeAddressId =
                EmployeeAddressFactory.buildId(employeeAddress);
        Optional<EmployeeAddress> read = read(employeeAddressId);
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeAddressList.add(employeeAddress);
        return employeeAddress;
    }
    @Override
    public Optional<EmployeeAddress> read(EmployeeAddress.EmployeeAddressId employeeAddressId){
        return this.employeeAddressList.stream()
                .filter(employeeAddress -> employeeAddress.getEmployeeNumber().equalsIgnoreCase(employeeAddressId.getEmployeeNumber()))
                .filter(employeeAddress -> employeeAddress.getAddressTypeId().equalsIgnoreCase(employeeAddressId.getAddressTypeId()))
                .findFirst();
    }
    @Override
    public void delete(EmployeeAddress employeeAddress){
        this.employeeAddressList.remove(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> findByEmployeeNumber(String employeeNumber){
        return this.employeeAddressList;
    }
}
