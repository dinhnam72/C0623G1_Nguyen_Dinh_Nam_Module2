package case_study.repository;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.interface_repo.ICustomerRepository;
import case_study.util.RAWFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String FILE_CUSTOMER = "D:\\Codegym\\module2_1\\C0623G1_Nguyen_Dinh_Nam_Module2\\C0623G1_Nguyen_Dinh_Nam_Module2\\src\\case_study\\data\\customer.csv";

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = RAWFile.readToCSV(FILE_CUSTOMER);
        String[] strings;
        Customer customer;
        for (String str : stringList) {
            strings = str.split(",");
            customer = new Customer(strings[0], strings[1], LocalDate.parse(strings[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), strings[3], strings[4],
                    strings[5], strings[6], strings[7], strings[8]);
            customerList.add(customer);
        }
        return customerList;

    }

    @Override
    public int checkId(String id) {
        int index = getAll().indexOf(new Customer(id));
        return index;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.inforToCSVCustomer());
        RAWFile.writeFromCSV(stringList, FILE_CUSTOMER, true);
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customerList = getAll();
        List<String> stringList = new ArrayList<>();
        customerList.set(checkId(id), customer);
        for (Customer c : customerList) {
            stringList.add(c.inforToCSVCustomer());
        }
        RAWFile.writeFromCSV(stringList, FILE_CUSTOMER, false);
    }

    @Override
    public void removeCustomer(String id) {
        List<Customer> customerList = getAll();
        List<String> stringList = new ArrayList<>();
        customerList.remove(checkId(id));
        for (Customer customer : customerList) {
            stringList.add(customer.inforToCSVCustomer());
        }
        RAWFile.writeFromCSV(stringList, FILE_CUSTOMER, false);
    }

    @Override
    public List<Customer> searchByNam(String name) {
        List<Customer> customerList = getAll();
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getName().contains(name)) {
                customers.add(customer);
            }
        }
        return customers;

    }
}
