package za.ac.cput.payrollmanagement.domain.employee;

import java.util.Objects;

public class EmployeeAddress{
    private final String employeeNumber, addressTypeId, address;
    private EmployeeAddress(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.addressTypeId = builder.addressTypeId;
        this.address = builder.address;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getAddressTypeId() {
        return addressTypeId;
    }

    public String getAddress() {
        return address;
    }
    public static class Builder {
        private String employeeNumber, addressTypeId, address;

        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder addressTypeId(String addressTypeId) {
            this.addressTypeId = addressTypeId;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder copy(EmployeeAddress employeeAddress) {
            this.addressTypeId = employeeAddress.addressTypeId;
            this.employeeNumber = employeeAddress.employeeNumber;
            this.address = employeeAddress.address;
            return this;
        }

        public EmployeeAddress build() {
            return new EmployeeAddress(this);
        }

    }

        public static class EmployeeAddressId{
            private String employeeNumber, addressTypeId;

            public EmployeeAddressId(String employeeNumber, String addressTypeId){
                this.employeeNumber = employeeNumber;
                this.addressTypeId = addressTypeId;
            }
            public String getEmployeeNumber(){
                return employeeNumber;
            }
            public String getAddressTypeId(){
                return addressTypeId;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EmployeeAddressId that = (EmployeeAddressId) o;
                return employeeNumber.equals(that.employeeNumber) &&
                        addressTypeId.equals(that.addressTypeId);
            }
            @Override
            public int hashCode() {
                return Objects.hash(employeeNumber, addressTypeId);
            }
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeAddress that = (EmployeeAddress) o;
        return employeeNumber.equals(that.employeeNumber) &&
                addressTypeId.equals(that.address);
    }
    @Override
    public int hashCode(){
        return Objects.hash(employeeNumber, addressTypeId);
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", addressTypeI='" + addressTypeId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
