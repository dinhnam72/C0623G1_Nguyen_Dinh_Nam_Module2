package case_study.service;

import case_study.common.ValidateEmployee;
import case_study.common.ValidatePerson;
import case_study.model.person.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.interface_repo.IEmployeeRepository;
import case_study.service.interface_service.IEmployeeService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        for (Employee employee : employeeRepository.getAll()) {
            System.out.println(employee);
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        String id;
        boolean flag;
        do {
            flag = false;
            System.out.print("Input id: ");
            id = scanner.nextLine();
            int index = employeeRepository.checkId(id);
            if (index != -1) {
                System.out.println("Duplicate id");
                flag = true;
                continue;
            }
            if (ValidateEmployee.inputAndCheckIdEmployee(id)) {
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
        String degree = ValidateEmployee.inputAndCheckDegree();
        String position = ValidateEmployee.inputAndCheckPosition();
        Double wage = ValidateEmployee.inputAndCheckWage();
        Employee employee = new Employee(id, name, date, gender, identityCard, telephone, email, degree, position, wage);
        employeeRepository.addEmployee(employee);

    }

    @Override
    public void edit() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (employeeRepository.checkId(id) == -1) {
                System.out.println("Id does not exist");
            }
        } while (employeeRepository.checkId(id) == -1);
        String name = ValidatePerson.inputAndCheckName();
        LocalDate date = ValidatePerson.inputAndCheckDayOfBirth();
        String gender = ValidatePerson.inputAndCheckGender();
        String identityCard = ValidatePerson.inputAndCheckIdentityCard();
        String telephone = ValidatePerson.inputAndCheckTelephone();
        String email = ValidatePerson.inputAndCheckEmail();
        String degree = ValidateEmployee.inputAndCheckDegree();
        String position = ValidateEmployee.inputAndCheckPosition();
        Double wage = ValidateEmployee.inputAndCheckWage();
        Employee employee = new Employee(id, name, date, gender, identityCard, telephone, email, degree, position, wage);
        employeeRepository.editEmployee(id, employee);
    }

    @Override
    public void remove() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (employeeRepository.checkId(id) == -1) {
                System.out.println("Id does not exist");
            }
        } while (employeeRepository.checkId(id) == -1);
        employeeRepository.removeEmployee(id);
    }

    @Override
    public void searchByName() {
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        List<Employee> employeeList = employeeRepository.searchByNam(name);
        if (employeeList.size() == 0) {
            System.out.println("Name does not exist");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }
}
