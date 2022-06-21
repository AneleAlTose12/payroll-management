package za.ac.cput.payrollmanagement.service.lookup.impl;

import za.ac.cput.payrollmanagement.domain.lookup.AddressType;
import za.ac.cput.payrollmanagement.domain.lookup.ContactType;
import za.ac.cput.payrollmanagement.service.lookup.ContactTypeService;

import java.util.List;
import java.util.Optional;

public class ContactTypeServiceImpl implements ContactTypeService {
    private final ContactTypeRepository repository;

    private static ContactTypeService SERVICE;

    private ContactTypeServiceImpl(){
        this.repository = ContactTypeRepositoryImpl.getRepository();
    }
    public static ContactTypeService getSERVICE(){
        if(SERVICE == null)
            SERVICE = new ContactTypeServiceImpl();
        return SERVICE;
    }
    @Override
    public ContactType save(ContactType contactType){
        return this repository save(contactType);
    }
    @Override
    public Optional<ContactType > read(String s){
        return this.repository.read(s);
    }
    @Override
    public void delete (ContactType addressType){
        this.repository.delete(contactType);
    }
    @Override
    public List<ContactType > findAll(){
        return this.repository.findAll();
    }
}
