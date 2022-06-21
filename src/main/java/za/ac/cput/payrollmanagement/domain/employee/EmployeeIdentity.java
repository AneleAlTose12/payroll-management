package za.ac.cput.payrollmanagement.domain.employee;

import java.util.Objects;

public class EmployeeIdentity {
    private final String employeeNumber, identityTypeId, identity;
    private EmployeeIdentity(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.identityTypeId = builder.identityTypeId;
        this.identity = builder.identity;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getIdentityTypeId() {
        return identityTypeId;
    }

    public String getIdentity() {
        return identity;
    }

    public static class Builder{
        private String employeeNumber, identityTypeId, identity;

        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Builder identityTypeId(String identityTypeId) {
            this.identityTypeId = identityTypeId;
            return this;
        }
        public Builder identity(String identity) {
            this.identity = identity;
            return this;
        }
        public Builder copy(EmployeeIdentity employeeIdentity){
            this.identityTypeId = employeeIdentity.identityTypeId;
            this.employeeNumber = employeeIdentity.employeeNumber;
            this.identity = employeeIdentity.identity;
            return this;
        }
        public EmployeeIdentity build(){
            return new EmployeeIdentity(this);
        }
    }
    public static class EmployeeIdentityId{
        private String employeeNumber, identityTypeId;

        public EmployeeIdentityId(String employeeNumber, String identityTypeId){
            this.employeeNumber = employeeNumber;
            this.identityTypeId = identityTypeId;
        }
        public String getEmployeeNumber(){
            return employeeNumber;
        }
        public String getIdentityTypeId(){
            return identityTypeId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EmployeeIdentityId that = (EmployeeIdentityId) o;
            return employeeNumber.equals(that.employeeNumber) &&
                    identityTypeId.equals(that.identityTypeId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(employeeNumber, identityTypeId);
        }
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeIdentity that = (EmployeeIdentity) o;
        return employeeNumber.equals(that.employeeNumber) &&
                identityTypeId.equals(that.identity);
    }
    @Override
    public int hashCode(){
        return Objects.hash(employeeNumber, identityTypeId);
    }

    @Override
    public String toString() {
        return "EmployeeIdentity{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", identityTypeId='" + identityTypeId + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
