package services;

import dao.EmployeeDao;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    public Employee viewEmployeeById(int id) {
        return employeeDao.viewEmployeeById(id);
    }

    List<Employee> viewAllEmployees() {
        return employeeDao.viewAllEmployees();
    }

    void editEmployee(Employee customer, int id) {
        employeeDao.editEmployee(customer, id);
    }

    void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);
    }
}
