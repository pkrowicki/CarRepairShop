package services;

import model.Customer;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Pawel Krowicki on 2017-07-05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CustomerServiceSpec extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void deleteDB() {
        jdbcTemplate.execute("TRUNCATE TABLE customers RESTART IDENTITY");
    }

    @Test
    public void shouldAddCustomer() throws Exception {
        //given
        String customerName = "AAA";

        //when
        customerService.addCustomer(new Customer("AAA", "BBB", "555"));

        //then
        Long count = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM customers WHERE CUSTOMERNAME LIKE ?", Long.class, customerName);
        Assertions.assertThat(count).isGreaterThan(0);
    }

    @Test
    public void shouldViewCustomer() throws Exception {
        //given
        Customer acustomer = new Customer("testUser1", "testSurname1", "testNumber555");
        Customer acustomer2 = new Customer("testUser2", "testSurname2", "testNumber556");
        Customer acustomer3 = new Customer("testUser3", "testSurname3", "testNumber557");
        jdbcTemplate.execute("INSERT INTO customers(CUSTOMERNAME, CUSTOMERSURNAME, CUSTOMERNUMBER) VALUES ('testUser1', 'testSurname1','testNumber555')");
        jdbcTemplate.execute("INSERT INTO customers(CUSTOMERNAME, CUSTOMERSURNAME, CUSTOMERNUMBER) VALUES ('testUser2', 'testSurname2','testNumber556')");
        jdbcTemplate.execute("INSERT INTO customers(CUSTOMERNAME, CUSTOMERSURNAME, CUSTOMERNUMBER) VALUES ('testUser4', 'testSurname4','testNumber556')");


        //when
        Customer customer = customerService.viewCustomerById(1);
        Customer customer2 = customerService.viewCustomerById(2);
        Customer customer3 = customerService.viewCustomerById(3);
        //then
        Assertions.assertThat(acustomer).isEqualToComparingFieldByField(customer);
        Assertions.assertThat(acustomer2).isEqualToComparingFieldByField(customer2);
        Assertions.assertThat(acustomer3).isNotEqualTo(customer3);
    }

}