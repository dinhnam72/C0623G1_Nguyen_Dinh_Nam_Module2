package case_study.service;

import case_study.common.ValidateCustomer;
import case_study.common.ValidateEmployee;
import case_study.common.ValidatePerson;
import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.CustomerRepository;
import case_study.repository.interface_repo.ICustomerRepository;
import case_study.service.interface_service.ICustomerService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerRepository.getAll()) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        String id;
        boolean flag;
        do {
            flag = false;
            System.out.print("Input id: ");
            id = scanner.nextLine();
            int index = customerRepository.checkId(id);
            if (index != -1) {
                System.out.println("Duplicate id");
                flag = true;
                continue;
            }
            if (ValidateCustomer.validateIdCustomer(id)) {
                System.out.println("Employee ID must be in the correct format:NV-YYYY (Y :0-9)");
                flag = true;
            }
        } while (flag);
        String name = ValidatePerson.inputAndCheckName();
        LocalDate date = ValidatePerson.inputAndCheckDayOfBirth();
        String gender = ValidatePerson.inputAndCheckGender();
        String identityCard = ValidatePerson.inputAndCheckIdentityCard();
        String telephone = ValidatePerson.inputAndCheckTelephone();
        String email = ValidatePerson.inputAndCheckEmail();
        String type = ValidateCustomer.inputAndCheckType();
        String address = ValidateCustomer.inputAddress();
        Customer customer = new Customer(id, name, date, gender, identityCard, telephone, email, type, address);
        customerRepository.addCustomer(customer);
    }

    @Override
    public void edit() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (customerRepository.checkId(id) == -1) {
                System.out.println("Id does not exist");
            }
        } while (customerRepository.checkId(id) == -1);
        String name = ValidatePerson.inputAndCheckName();
        LocalDate date = ValidatePerson.inputAndCheckDayOfBirth();
        String gender = ValidatePerson.inputAndCheckGender();
        String identityCard = ValidatePerson.inputAndCheckIdentityCard();
        String telephone = ValidatePerson.inputAndCheckTelephone();
        String email = ValidatePerson.inputAndCheckEmail();
        String type = ValidateCustomer.inputAndCheckType();
        String address = ValidateCustomer.inputAddress();
        Customer customer = new Customer(id, name, date, gender, identityCard, telephone, email, type, address);
        customerRepository.editCustomer(id, customer);
    }

    @Override
    public void remove() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (customerRepository.checkId(id) == -1) {
                System.out.println("Id does not exist");
            }
        } while (customerRepository.checkId(id) == -1);
        customerRepository.removeCustomer(id);
    }

    @Override
    public void searchByName() {
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        List<Customer> customerList = customerRepository.searchByNam(name);
        for (Customer customer:customerList){
            System.out.println(customer);
        }
    }
}
