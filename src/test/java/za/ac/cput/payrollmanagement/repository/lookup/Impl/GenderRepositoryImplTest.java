package za.ac.cput.payrollmanagement.repository.lookup.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.payrollmanagement.domain.lookup.Gender;
import za.ac.cput.payrollmanagement.factory.lookup.GenderFactory;
import za.ac.cput.payrollmanagement.repository.lookup.GenderRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GenderRepositoryImplTest {
    private Gender gender;
    private GenderRepository repository;

    @BeforeEach
    void setUp(){
        this.gender = GenderFactory.build("test-id", "test-gender");
        this.repository = GenderRepositoryImpl.genderRepository();
        Gender saved = this.repository.save(this.gender);
        assertSame(this.gender, saved);
    }
    @AfterEach
        void tearDown(){
        this.repository.delete(this.gender);
        List<Gender>genderList = this.repository.findAll();
        assertEquals(0, genderList.size());
    }

    /**@Test
    void save() {
        Gender saved = this.repository.save(this.gender);
        System.out.println(saved);
        assertNotNull(saved);
        assertSame(this.gender, saved);
    }**/
    @Test
    void read(){
        Optional<Gender>read = this.repository.read(this.gender.getId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.gender , read.get())
        );
    }
    /**@Test
    void delete() {
        Gender saved = this.repository.save(this.gender);
        List<Gender>genderList = this.repository.findAll();
        assertEquals(1, genderList.size());
        this.repository.delete(saved);
    }**/
    @Test
    void findAll() {
        List<Gender>genderList = this.repository.findAll();
        assertEquals(1, genderList.size());
    }
}