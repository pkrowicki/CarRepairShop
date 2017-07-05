package dao;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-05.
 */
public class EmployeeDaoImpl implements EmployeeDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addEmployee(Employee employee) {
        jdbcTemplate.update("INSERT INTO employees(name, surname, number) VALUES (?,?,?)", employee.getEmployeeName(), employee.getEmployeeSurname(), employee.getEmployeeNumber());
    }

    @Override
    public Employee viewEmployeeById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM employees WHERE id = ?", getEmployeeRowMapper(),id);
    }

    @Override
    public List<Employee> viewAllEmployees() {
        return jdbcTemplate.query("SELECT * FROM employees", getEmployeeRowMapper());
    }

    @Override
    public void editEmployee(Employee employee, int id) {
        jdbcTemplate.update("UPDATE employees SET cemployeename=?, employeesurname=?,employeenumber=? WHERE id = ?", employee.getEmployeeName(), employee.getEmployeeSurname(), employee.getEmployeeNumber(),id);
    }

    @Override
    public void deleteEmployee(int id) {
        jdbcTemplate.update("DELETE FROM employees WHERE id=?", id);
    }

    private RowMapper<Employee> getEmployeeRowMapper(){
        return new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String employeename = resultSet.getString("employeename");
                String employeesurname = resultSet.getString("employeesurname");
                String employeenumber = resultSet.getString("employeenumber");

                return new Employee(id,employeename,employeesurname,employeenumber);
            }
        };
    }
}
