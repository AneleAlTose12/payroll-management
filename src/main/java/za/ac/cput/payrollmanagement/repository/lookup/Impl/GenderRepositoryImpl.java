package za.ac.cput.payrollmanagement.repository.lookup.Impl;

import za.ac.cput.payrollmanagement.domain.lookup.Gender;
import za.ac.cput.payrollmanagement.repository.IRepository;
import za.ac.cput.payrollmanagement.repository.lookup.GenderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Responsible for CRUD into the data store
//Implemented singleton
public class GenderRepositoryImpl implements GenderRepository {
    private final List<Gender> genderList;
    private static GenderRepositoryImpl GENDER_REPOSITORY;

    private GenderRepositoryImpl(){
        this.genderList = new ArrayList<>();
    }
    public static GenderRepositoryImpl genderRepository(){
        if(GENDER_REPOSITORY == null)
            GENDER_REPOSITORY = new GenderRepositoryImpl();
        return GENDER_REPOSITORY;
    }
    public Gender save(Gender gender){
        Optional<Gender> read = read(gender.getId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.genderList.add(gender);
        return gender;
    }
    public Optional<Gender> read(String id){
        //Find the gender that matches the id and return something
       return this.genderList.stream().filter(g -> g.getId().equalsIgnoreCase(id))
           .findFirst();
    }
    public void delete(Gender gender){
        //Find the gender if needed and delete
        this.genderList.remove(gender);
    }
    public List<Gender> findAll(){
        //Return all in your store
        return this.genderList;
    }
}
