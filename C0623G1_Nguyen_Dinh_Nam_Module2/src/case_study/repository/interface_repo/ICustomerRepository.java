package case_study.repository.interface_repo;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    int checkId (String id);
    void addCustomer(Customer customer);
    void editCustomer(String id, Customer customer);
    void removeCustomer(String id);
    List<Customer> searchByNam(String name);

}
