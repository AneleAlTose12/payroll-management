package za.ac.cput.payrollmanagement.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.payrollmanagement.domain.lookup.ContactType;

@RestController
@RequestMapping("payroll/contact/type/")
public class ContactTypeController {

    @PostMapping("save")
    public ContactType save(ContactType contactType){
        return null;
    }
}

