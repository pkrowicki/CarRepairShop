package services;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class EmployeeService {
    @Autowired
    private UserDaoEmployeeImpl daoEmployee;

    public Employee getDaoEmployee(int index) {
        return this.daoEmployee.getEmployee(index);
    }

    public void addEmployee(Employee employee){
        daoEmployee.addUser(employee);
    }
}
