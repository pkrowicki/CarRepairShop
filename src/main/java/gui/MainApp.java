package gui;

import model.Customer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.EmployeeService;
import services.OrdersService;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrdersService orderService = applicationContext.getBean(OrdersService.class);



    }
}
