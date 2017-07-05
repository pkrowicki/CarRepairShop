package model;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Order {

    private int orderId;

    private final int employeeID;
    private final int customerID;

    public Order(int orderId, Employee assignedEmployee, Customer customer) {
        this.orderId=orderId;
        this.employeeID = assignedEmployee.getId();
        this.customerID = customer.getId();
    }

    public int getOrderId() {
        return orderId;
    }
}
