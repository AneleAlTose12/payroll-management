package za.ac.cput.payrollmanagement.factory.lookup;

import za.ac.cput.payrollmanagement.domain.lookup.IdentityType;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class IdentityTypeFactory {
    public static IdentityType build(String id, String name){
        if (StringHelper.isEmptyOrNull(id) || StringHelper.isEmptyOrNull(name))
            throw new IllegalArgumentException("id and/or name");
        return new IdentityType.Builder().id(id).name(name).build();
    }
}
