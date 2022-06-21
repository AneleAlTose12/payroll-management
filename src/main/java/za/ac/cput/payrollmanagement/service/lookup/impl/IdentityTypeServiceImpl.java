package za.ac.cput.payrollmanagement.service.lookup.impl;

import za.ac.cput.payrollmanagement.domain.lookup.Gender;
import za.ac.cput.payrollmanagement.repository.lookup.GenderRepository;
import za.ac.cput.payrollmanagement.repository.lookup.Impl.GenderRepositoryImpl;
import za.ac.cput.payrollmanagement.service.lookup.GenderService;

import java.util.Optional;

public class IdentityTypeServiceImpl implements GenderService {
    private final GenderRepository repository;
    private static GenderService SERVICE;

    private IdentityTypeServiceImpl(){
        this.repository = GenderRepositoryImpl.genderRepository();
    }
    public static GenderService getService(){
        if(SERVICE == null)
            SERVICE = new IdentityTypeServiceImpl();
        return SERVICE;
    }
    @Override
    public Gender save(Gender gender){
        return this.repository.save(gender);
    }
    @Override
    public Optional<Gender> read(String s){
        return this.repository.read(s);
    }
    @Override
    public void delete(Gender gender){
        this.repository.delete(gender);
    }

}
