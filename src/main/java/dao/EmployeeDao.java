package dao;

import model.Customer;
import model.Employee;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-05.
 */
public interface EmployeeDao {
    void addEmployee(Employee employee);
    Employee viewEmployeeById(int id);
    List<Employee> viewAllEmployees();
    void editEmployee(Employee employee, int id);
    void deleteEmployee(int id);

}
