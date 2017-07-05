package dao;

import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    CustomerDao customerDao;
    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void addOrder(Order order) {
            jdbcTemplate.update("INSERT INTO orders(employeeID, customerID) VALUES (?,?)", order.getEmployeeID(), order.getCustomerID());
    }

    @Override
    public Order getOrderById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM orders WHERE id = ?", getOrderRowMapper(),id);
    }

    @Override
    public List<Order> viewAllOrders() {
        return jdbcTemplate.query("SELECT * FROM orders", getOrderRowMapper());
    }

    @Override
    public void editOrder(Order order, int id) {
        jdbcTemplate.update("UPDATE orders SET emplyeeId=?, customerId=? WHERE id = ?", order.getEmployeeID(), order.getCustomerID(), id);
    }

    @Override
    public void deleteOrder(int id) {
        jdbcTemplate.update("DELETE FROM orders WHERE id=?", id);

    }

    private RowMapper<Order> getOrderRowMapper(){
        return new RowMapper<Order>() {
            @Override
            public Order mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                int employeeid = resultSet.getInt("employeeid");
                int customerid = resultSet.getInt("customerid");
                employeeDao.viewEmployeeById(employeeid);
                customerDao.viewCustomerById(customerid);
                return new Order(id,employeeDao.viewEmployeeById(employeeid),customerDao.viewCustomerById(customerid));
            }
        };
    }

}
