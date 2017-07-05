package dao;

import model.*;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class OrderDaoImpl implements OrderDao {

    public List<Order> orderList;

    @Override
    public void addOrder(List<Order> orders) {
        this.orderList = orders;
    }

    @Override
    public Order getOrder(int number) {
        return orderList.get(number);
    }
}
