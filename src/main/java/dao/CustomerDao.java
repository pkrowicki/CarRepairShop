package dao;

import model.Customer;
import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-05.
 */
public interface CustomerDao {
    void addCustomer(Customer customer);
    Customer viewCustomerById(int id);
    List<Customer> viewAllCustomers();
    void editCustomer(Customer customer,int id);
    void deleteCustomer(int id);
}
