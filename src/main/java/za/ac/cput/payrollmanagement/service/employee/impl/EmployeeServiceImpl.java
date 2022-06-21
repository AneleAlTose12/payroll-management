package za.ac.cput.payrollmanagement.service.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeIdentity;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeIdentityRepository;
import za.ac.cput.payrollmanagement.repository.employee.impl.EmployeeIdentityRepositoryImpl;
import za.ac.cput.payrollmanagement.service.employee.EmployeeIdentityService;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeIdentityService {
    private final EmployeeIdentityRepository repository;
    private static EmployeeIdentityService SERVICE;

    private EmployeeServiceImpl(){
        this.repository = EmployeeIdentityRepositoryImpl.getRepository();
    }
    public static EmployeeIdentityService getService(){
        if(SERVICE == null)
            SERVICE = new EmployeeServiceImpl();
        return SERVICE;
    }

    @Override
    public EmployeeIdentity save(EmployeeIdentity employeeIdentity) {
        return this.repository.save(employeeIdentity);
    }

    @Override
    public Optional<EmployeeIdentity> read(EmployeeIdentity
                   .EmployeeIdentityId employeeIdentityId) {
        return this.repository.read(employeeIdentityId);
    }

    @Override
    public void delete(EmployeeIdentity employeeIdentity) {
        this.repository.delete(employeeIdentity);
    }

    @Override
    public List<EmployeeIdentity> findByEmployeeNumber(String employeeNumber) {
        return this.repository.findByEmployeeNumber(employeeNumber);
    }
}
