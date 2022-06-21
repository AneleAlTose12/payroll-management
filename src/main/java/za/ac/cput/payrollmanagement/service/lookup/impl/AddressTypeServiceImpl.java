package za.ac.cput.payrollmanagement.service.lookup.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.payrollmanagement.domain.lookup.AddressType;
import za.ac.cput.payrollmanagement.service.lookup.AddressTypeService;

import java.util.List;
import java.util.Optional;

@Service
public class AddressTypeServiceImpl implements AddressTypeService {
    private final AddressTypeRepository repository;

    public AddressTypeServiceImpl(AddressTypeRepository repository){
        this.repository = repository;
    }

    @Override
    public AddressType save(AddressType addressType){
        return this.repository.save(addressType);
    }
    @Override
    public Optional<AddressType> read(String s){
        return this.repository.read(s);
    }
    @Override
    public void delete (AddressType addressType){
        this.repository.delete(addressType);
    }
    @Override
    public List<AddressType> findAll(){
        return this.repository.findAll();
    }
}
