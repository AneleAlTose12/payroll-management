package za.ac.cput.payrollmanagement.service.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeContact;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeContactRepository;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeIdentityRepository;
import za.ac.cput.payrollmanagement.repository.employee.impl.EmployeeContactRepositoryImpl;
import za.ac.cput.payrollmanagement.repository.employee.impl.EmployeeIdentityRepositoryImpl;
import za.ac.cput.payrollmanagement.service.employee.EmployeeContactService;
import za.ac.cput.payrollmanagement.service.employee.EmployeeIdentityService;

import java.util.List;
import java.util.Optional;

public class EmployeeContactServiceImpl implements EmployeeContactService {
    private final EmployeeContactRepository repository;
    private static EmployeeContactService SERVICE;

    private EmployeeContactServiceImpl(){
        this.repository = EmployeeContactRepositoryImpl.getEmployeeContactRepository();
    }
    public static EmployeeContactService getService(){
        if(SERVICE == null)
            SERVICE = new EmployeeContactServiceImpl();
        return SERVICE;
    }


    @Override
    public EmployeeContact save(EmployeeContact employeeContact) {
        return this.repository.save(employeeContact);
    }

    @Override
    public Optional<EmployeeContact> read(EmployeeContact
                        .EmployeeContactId employeeContactId) {
        return this.repository.read(employeeContactId);
    }

    @Override
    public void delete(EmployeeContact employeeContact) {
            this.repository.delete(employeeContact);
    }

    @Override
    public List<EmployeeContact> findByEmployeeNumber(String employeeNumber) {
        return this.repository.findByEmployeeNumber(employeeNumber);
    }
}
