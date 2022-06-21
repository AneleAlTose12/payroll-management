package za.ac.cput.payrollmanagement.factory.lookup;

import za.ac.cput.payrollmanagement.domain.lookup.Gender;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class GenderFactory {
    public static Gender build(String id, String name){
        if (StringHelper.isEmptyOrNull(id) || StringHelper.isEmptyOrNull(name))
            throw new IllegalArgumentException("id and/or name");
        return new Gender.Builder().id(id).name(name).build();
    }
}
