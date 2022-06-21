package za.ac.cput.payrollmanagement.factory.lookup;

import za.ac.cput.payrollmanagement.domain.lookup.AddressType;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class AddressTypeFactory {
    public static AddressType build(String id, String name){
        if (StringHelper.isEmptyOrNull(id) || StringHelper.isEmptyOrNull(name))
            throw new IllegalArgumentException("id and/or name");
        return new AddressType.Builder().id(id).name(name).build();
    }
}
