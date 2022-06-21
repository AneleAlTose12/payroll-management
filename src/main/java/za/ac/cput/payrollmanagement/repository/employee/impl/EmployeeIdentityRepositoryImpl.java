package za.ac.cput.payrollmanagement.repository.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeIdentityFactory;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeIdentityRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeIdentityRepositoryImpl implements EmployeeIdentityRepository {
    private final List<EmployeeIdentity> employeeIdentityList;
    private static EmployeeIdentityRepositoryImpl EMPLOYEE_IDENTITY_REPOSITORY;

    private EmployeeIdentityRepositoryImpl(){
        this.employeeIdentityList = new ArrayList<>();
    }
    public static EmployeeIdentityRepositoryImpl getRepository(){
        if(EMPLOYEE_IDENTITY_REPOSITORY == null)
            EMPLOYEE_IDENTITY_REPOSITORY = new EmployeeIdentityRepositoryImpl();
        return EMPLOYEE_IDENTITY_REPOSITORY;
    }
    @Override
    public EmployeeIdentity save(EmployeeIdentity employeeIdentity){
        EmployeeIdentity.EmployeeIdentityId employeeIdentityId =
                EmployeeIdentityFactory.buildId(employeeIdentity);
        Optional<EmployeeIdentity> read = read(employeeIdentityId);
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeIdentityList.add(employeeIdentity);
        return employeeIdentity;
    }
    @Override
    public Optional<EmployeeIdentity> read(EmployeeIdentity.EmployeeIdentityId employeeIdentityId){
        return this.employeeIdentityList.stream()
                .filter(employeeIdentity -> employeeIdentity.getEmployeeNumber().equalsIgnoreCase(employeeIdentityId.getEmployeeNumber()))
                .filter(employeeIdentity -> employeeIdentity.getIdentityTypeId().equalsIgnoreCase(employeeIdentityId.getIdentityTypeId()))
                .findFirst();
    }
    @Override
    public void delete(EmployeeIdentity  employeeIdentity){
        this.employeeIdentityList.remove( employeeIdentity);
    }

    @Override
    public List<EmployeeIdentity> findByEmployeeNumber(String employeeNumber){
        return this.employeeIdentityList;

    }
}
