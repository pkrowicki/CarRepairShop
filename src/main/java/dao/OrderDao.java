package dao;

import model.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
@Repository
public interface OrderDao {
    void addOrder(List<Order> orders);
    Order getOrder(int number);
}
