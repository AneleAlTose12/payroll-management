package za.ac.cput.payrollmanagement.repository.employee.impl;

import za.ac.cput.payrollmanagement.domain.employee.Employee;
import za.ac.cput.payrollmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeAddressFactory;
import za.ac.cput.payrollmanagement.factory.employee.EmployeeFactory;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeAddressRepository;
import za.ac.cput.payrollmanagement.repository.employee.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryImpl /**implements EmployeeRepository**/ {
    /**private final List<Employee> employeeList;
    //This is how to implement singlethon
    private static EmployeeRepository EMPLOYEE_REPOSITORY;

    private EmployeeRepositoryImpl(){
        this.employeeList = new ArrayList<>();
    }

    public static EmployeeRepository getRepository(){
        if(EMPLOYEE_REPOSITORY == null)
            EMPLOYEE_REPOSITORY = new EmployeeRepositoryImpl();
        return EMPLOYEE_REPOSITORY;
    }
    @Override
    public Employee save(Employee employee){
        Employee.EmployeeId employeeId =
                EmployeeFactory.buildId(employee);
        Optional<Employee> read = read(employeeId);
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeList.add(employee);
        return employee;
    }
    @Override
    public Optional<Employee> read(Employee.EmployeeId employeeId){
        return this.employeeList.stream()
                .filter(employee -> employee.getEmployeeNumber().equalsIgnoreCase(employeeId.getEmployeeNumber()))
                .filter(employeeAddress -> employeeAddress.getEmployeeId().equalsIgnoreCase(employeeId.getEmployeeId()))
                .findFirst();
    }
    @Override
    public void delete(Employee employee){
        this.employeeList.remove(employee);
    }

    @Override
    public List<Employee> findByEmployeeNumber(String employeeNumber){
        return this.employeeList;

    }**/
}
