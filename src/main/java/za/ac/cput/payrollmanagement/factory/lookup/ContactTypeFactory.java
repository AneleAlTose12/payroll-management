package za.ac.cput.payrollmanagement.factory.lookup;

import za.ac.cput.payrollmanagement.domain.lookup.ContactType;
import za.ac.cput.payrollmanagement.helper.StringHelper;

public class ContactTypeFactory {
    public static ContactType build(String id, String name){
        if (StringHelper.isEmptyOrNull(id) || StringHelper.isEmptyOrNull(name))
            throw new IllegalArgumentException("id and/or name");
        return new ContactType.Builder().id(id).name(name).build();
    }
}
