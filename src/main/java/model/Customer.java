package model;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Customer {
    private final int id;
    private final String customerName;
    private final String customerSurname;
    private String customerNumber;

    public Customer(int id, String customerName, String customerSurname, String customerNumber) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerNumber = customerNumber;
        this.id = id;
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

}
