package services;

import dao.CustomerDao;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public Customer viewCustomerById(int id) {
        return customerDao.viewCustomerById(id);
    }

    List<Customer> viewAllCustomers() {
        return customerDao.viewAllCustomers();
    }

    void editCustomer(Customer customer, int id) {
        customerDao.editCustomer(customer, id);
    }

    void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }
}
