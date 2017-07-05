package gui;

import model.Employee;
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

        Employee employee1 = new Employee(1,"eryk","ryk", "32322");
        EmployeeService employeeService = new EmployeeService();

    }
}
