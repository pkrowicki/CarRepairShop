package dao;

import model.Employee;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-05.
 */
public interface EmployeeDao {
    void addEmployee();
    Employee viewEmployee(int id);
    List<Employee> viewAllEmployees();
    void editEmployee(int id);
    void deleteEmployee(int id);

}
