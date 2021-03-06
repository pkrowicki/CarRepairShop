package model;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Order {

    private int orderId;

    private final int employeeID;
    private final int customerID;

    public Order(Employee employee, Customer customer) {
        this.employeeID = employee.getId();
        this.customerID = customer.getId();
    }

    public int getOrderId() {
        return orderId;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
