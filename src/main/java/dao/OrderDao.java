package dao;

import model.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
@Repository
public interface OrderDao {
    void addOrder(Order order);
    Order getOrderById(int id);
    List<Order> viewAllOrders();

}
