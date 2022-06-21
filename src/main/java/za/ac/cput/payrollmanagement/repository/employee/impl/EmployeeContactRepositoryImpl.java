package za.ac.cput.payrollmanagement.repository.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeContact;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeContactFactory;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeContactRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeContactRepositoryImpl implements EmployeeContactRepository {
    private final List<EmployeeContact> employeeContactList;
    private static EmployeeContactRepositoryImpl EMPLOYEE_CONTACT_REPOSITORY;

    private EmployeeContactRepositoryImpl(){
        this.employeeContactList = new ArrayList<>();
    }

    public static EmployeeContactRepositoryImpl getEmployeeContactRepository(){
        if(EMPLOYEE_CONTACT_REPOSITORY == null)
            EMPLOYEE_CONTACT_REPOSITORY = new EmployeeContactRepositoryImpl();
        return EMPLOYEE_CONTACT_REPOSITORY;
    }
    @Override
    public EmployeeContact save(EmployeeContact employeeContact){
        EmployeeContact.EmployeeContactId employeeContactId =
                EmployeeContactFactory.buildId(employeeContact);
        Optional<EmployeeContact> read = read(employeeContactId);
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeContactList.add(employeeContact);
        return employeeContact;
    }
    @Override
    public Optional<EmployeeContact> read(EmployeeContact.EmployeeContactId employeeContactId){
        return this.employeeContactList.stream()
                .filter(employeeContact -> employeeContact.getEmployeeNumber().equalsIgnoreCase(employeeContactId.getEmployeeNumber()))
                .filter(employeeContact -> employeeContact.getContactTypeId().equalsIgnoreCase(employeeContactId.getContactTypeId()))
                .findFirst();
    }
    @Override
    public void delete(EmployeeContact employeeContact){
        this.employeeContactList.remove(employeeContact);
    }

    @Override
    public List<EmployeeContact> findByEmployeeNumber(String employeeNumber) {

        return this.employeeContactList;
    }
}
