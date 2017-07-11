package dao;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-05.
 */
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addCustomer(Customer customer) {
        jdbcTemplate.update("INSERT INTO customers(customername, customersurname, customernumber) VALUES (?,?,?)", customer.getCustomerName(),customer.getCustomerSurname(),customer.getCustomerNumber());
    }

    @Override
    public Customer viewCustomerById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM customers WHERE id = ?", getCustomerRowMapper(),id);
    }

    @Override
    public List<Customer> viewAllCustomers() {
        return jdbcTemplate.query("SELECT * FROM customers c ORDER BY c.id", getCustomerRowMapper());
    }

    @Override
    public void editCustomer(Customer customer, int id) {
        jdbcTemplate.update("UPDATE customers SET customername=?, customersurname=?,customernumber=? WHERE id = ?", customer.getCustomerName(),customer.getCustomerSurname(),customer.getCustomerName(),id);
    }

    @Override
    public void deleteCustomer(int id) {
        jdbcTemplate.update("DELETE FROM customers WHERE id=?", id);
    }

    private RowMapper<Customer> getCustomerRowMapper(){
        return new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                int customerId = resultSet.getInt("id");
                String customerName = resultSet.getString("customername");
                String customerSurname = resultSet.getString("customersurname");
                String customerPhone = resultSet.getString("customernumber");

                return new Customer(customerId,customerName,customerSurname,customerPhone);
            }
        };
    }
}
