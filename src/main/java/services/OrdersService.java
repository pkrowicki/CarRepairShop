package services;

import dao.OrderDao;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class OrdersService {

    @Autowired
    private OrderDao orderDao;

    public void addNewOrder(Order order) {
        orderDao.addOrder(order);
    }

    public Order viewEmployeeById(int id) {
        return orderDao.getOrderById(id);
    }

    List<Order> viewAllEmployees() {
        return orderDao.viewAllOrders();
    }

    void editEmployee(Order order, int id) {
        orderDao.editOrder(order, id);
    }

    void deleteEmployee(int id) {
        orderDao.deleteOrder(id);
    }


}
