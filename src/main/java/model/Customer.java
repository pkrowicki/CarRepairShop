package model;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Customer {
    private int id;
    private final String customerName;
    private final String customerSurname;
    private String customerNumber;

    public Customer(String customerName, String customerSurname, String customerNumber) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
