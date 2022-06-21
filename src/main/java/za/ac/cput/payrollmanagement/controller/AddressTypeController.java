package za.ac.cput.payrollmanagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.payrollmanagement.domain.lookup.AddressType;
import za.ac.cput.payrollmanagement.service.lookup.AddressTypeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("payroll/address/type/")
public class AddressTypeController {

    private final AddressTypeService addressTypeService;

    public AddressTypeController(AddressTypeService addressTypeService){
        this.addressTypeService = addressTypeService;
    }

    @PostMapping("save")
    public AddressType save(AddressType addressType){
        return addressTypeService.save(addressType);
    }

    public Optional<AddressType> read(String s) {
        return addressTypeService.read(s);

    }
    public void delete (AddressType addressType){
        this.addressTypeService.delete(addressType);
    }
    public List<AddressType> findAll(){
        return this.addressTypeService.findAll();
    }
}
