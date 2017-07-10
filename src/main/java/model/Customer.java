package model;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Customer {
    private int id;
    private String customerName;
    private String customerSurname;
    private String customerNumber;

    public Customer() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (customerName != null ? !customerName.equals(customer.customerName) : customer.customerName != null)
            return false;
        if (customerSurname != null ? !customerSurname.equals(customer.customerSurname) : customer.customerSurname != null)
            return false;
        return customerNumber != null ? customerNumber.equals(customer.customerNumber) : customer.customerNumber == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerSurname != null ? customerSurname.hashCode() : 0);
        result = 31 * result + (customerNumber != null ? customerNumber.hashCode() : 0);
        return result;
    }
}
