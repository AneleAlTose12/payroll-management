package za.ac.cput.payrollmanagement.repository.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeRace;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeAddressFactory;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeRaceFactory;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeAddressRepository;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeRaceRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {
    private final List<EmployeeRace> employeeRaceList;
    //This is how to implement singlethon
    private static EmployeeRaceRepository EMPLOYEE_RACE_REPOSITORY;

    private EmployeeRaceRepositoryImpl(){
        this.employeeRaceList = new ArrayList<>();
    }

    public static EmployeeRaceRepository getRepository(){
        if(EMPLOYEE_RACE_REPOSITORY == null)
            EMPLOYEE_RACE_REPOSITORY = new EmployeeRaceRepositoryImpl();
        return EMPLOYEE_RACE_REPOSITORY;
    }
    @Override
    public EmployeeRace save(EmployeeRace employeeRace){
        EmployeeRace.EmployeeRaceId employeeRaceId =
                EmployeeRaceFactory.buildId(employeeRace);
        Optional<EmployeeRace> read = read(employeeRaceId);
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeRaceList.add(employeeRace);
        return employeeRace;
    }
    @Override
    public Optional<EmployeeRace> read(EmployeeRace.EmployeeRaceId employeeRaceId){
        return this.employeeRaceList.stream()
                .filter(employeeRace -> employeeRace.getEmployeeNumber().equalsIgnoreCase(employeeRaceId.getEmployeeNumber()))
                .filter(employeeRace -> employeeRace.getRaceId().equalsIgnoreCase(employeeRaceId.getRaceId()))
                .findFirst();
    }
    @Override
    public void delete(EmployeeRace employeeRace){
        this.employeeRaceList.remove(employeeRace);
    }

    @Override
    public List<EmployeeRace> findByEmployeeNumber(String employeeNumber){
        return this.employeeRaceList;

    }
}
