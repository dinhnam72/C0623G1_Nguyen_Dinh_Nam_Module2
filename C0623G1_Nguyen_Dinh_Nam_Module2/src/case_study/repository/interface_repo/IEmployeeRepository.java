package case_study.repository.interface_repo;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAll();
    int checkId (String id);
    void addEmployee(Employee employee);
    void editEmployee(String id, Employee employee);
    void removeEmployee(String id);
    List<Employee> searchByNam(String name);

}
