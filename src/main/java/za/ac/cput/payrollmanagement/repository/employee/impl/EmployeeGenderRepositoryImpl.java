package za.ac.cput.payrollmanagement.repository.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeGender;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeAddressFactory;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeGenderFactory;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeAddressRepository;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeGenderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {
    private final List<EmployeeGender> employeeGenderList;
    //This is how to implement singlethon
    private static EmployeeGenderRepository EMPLOYEE_GENDER_REPOSITORY;

    private EmployeeGenderRepositoryImpl(){
        this.employeeGenderList = new ArrayList<>();
    }

    public static EmployeeGenderRepository getRepository(){
        if(EMPLOYEE_GENDER_REPOSITORY == null)
            EMPLOYEE_GENDER_REPOSITORY = new EmployeeGenderRepositoryImpl();
        return EMPLOYEE_GENDER_REPOSITORY;
    }
    @Override
    public EmployeeGender save(EmployeeGender employeeGender){
        EmployeeGender.EmployeeGenderId employeeGenderId =
                EmployeeGenderFactory.buildId(employeeGender);
        Optional<EmployeeGender> read = read(employeeGenderId);
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeGenderList.add(employeeGender);
        return employeeGender;
    }
    @Override
    public Optional<EmployeeGender> read(EmployeeGender.EmployeeGenderId employeeGenderId){
        return this.employeeGenderList.stream()
                .filter(employeeGender -> employeeGender.getEmployeeNumber().equalsIgnoreCase(employeeGenderId.getEmployeeNumber()))
                .filter(employeeGender -> employeeGender.getGenderId().equalsIgnoreCase(employeeGenderId.getGenderId()))
                .findFirst();
    }
    @Override
    public void delete(EmployeeGender employeeGender){
        this.employeeGenderList.remove(employeeGender);
    }

    @Override
    public List<EmployeeGender> findByEmployeeNumber(String employeeNumber){
        return this.employeeGenderList;
    }
}
