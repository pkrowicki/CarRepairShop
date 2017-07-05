package model;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Employee {
    private final int id;
    private final String employeeName;
    private final String employeeSurname;
    private String employeeNumber;

    public Employee(int id, String employeeName, String employeeSurname, String employeeNumber) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeeNumber = employeeNumber;
    }

    public int getId() {
        return this.id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }
}
