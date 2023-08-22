package case_study.repository;

import case_study.model.person.Employee;
import case_study.repository.interface_repo.IEmployeeRepository;
import case_study.util.RAWFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String FILE_EMPLOYEE = "D:\\Codegym\\module2_1\\C0623G1_Nguyen_Dinh_Nam_Module2\\C0623G1_Nguyen_Dinh_Nam_Module2\\src\\case_study\\data\\employee.csv";

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = RAWFile.readToCSV(FILE_EMPLOYEE);
        String[] strings;
        Employee employee;
        for (String str : stringList) {
            strings = str.split(",");
            employee = new Employee(strings[0], strings[1], LocalDate.parse(strings[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), strings[3], strings[4],
                    strings[5], strings[6], strings[7], strings[8], Double.parseDouble(strings[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public int checkId(String id) {
        int index = getAll().indexOf(new Employee(id));
        return index;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.inforToCSVEmployee());
        RAWFile.writeFromCSV(stringList, FILE_EMPLOYEE, true);
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        List<Employee> employeeList = getAll();
        List<String> stringList = new ArrayList<>();
        employeeList.set(checkId(id), employee);
        for (Employee e : employeeList) {
            stringList.add(e.inforToCSVEmployee());
        }
        RAWFile.writeFromCSV(stringList, FILE_EMPLOYEE, false);
    }

    @Override
    public void removeEmployee(String id) {
        List<Employee> employeeList = getAll();
        List<String> stringList = new ArrayList<>();
        employeeList.remove(checkId(id));
        for (Employee e : employeeList) {
            stringList.add(e.inforToCSVEmployee());
        }
        RAWFile.writeFromCSV(stringList, FILE_EMPLOYEE, false);
    }

    @Override
    public List<Employee> searchByNam(String name) {
        List<Employee> employeeList = getAll();
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getName().contains(name)) {
                employees.add(employee);
            }
        }
        return employees;
    }
}
