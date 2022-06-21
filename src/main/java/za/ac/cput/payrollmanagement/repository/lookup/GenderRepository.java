package za.ac.cput.payrollmanagement.repository.lookup;

import za.ac.cput.payrollmanagement.domain.lookup.Gender;
import za.ac.cput.payrollmanagement.repository.IRepository;

import java.util.List;

public interface GenderRepository extends IRepository<Gender, String> {
    List<Gender> findAll();
}
