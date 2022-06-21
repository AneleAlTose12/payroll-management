package za.ac.cput.payrollmanagement.service.lookup;

import za.ac.cput.payrollmanagement.domain.lookup.AddressType;
import za.ac.cput.payrollmanagement.service.IService;

import java.util.List;

public interface AddressTypeService extends IService<AddressType, String> {
    List<AddressType> findAll();
}
