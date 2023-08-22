package case_study.model.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Customer extends Person{
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String id) {
        super(id);
    }

    public Customer(String id, String name, LocalDate date, String gender, String identityCard, String telephone, String email, String type, String address) {
        super(id, name, date, gender, identityCard, telephone, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String inforToCSVCustomer(){
        return this.getId() + "," + this.getName() + "," + this.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," +
                this.getGender() + "," + this.getIdentityCard() + "," + this.getTelephone() + "," +
                this.getEmail() + "," + this.type + "," + this.address;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customer.getId(), super.getId());
    }
}
