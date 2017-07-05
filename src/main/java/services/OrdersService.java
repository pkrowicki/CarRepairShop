package services;

import dao.OrderDao;
import dao.PartDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class OrdersService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private PartDao partDao;
    @Autowired
    private UserDaoEmployeeImpl employeeDao;
    @Autowired


}
