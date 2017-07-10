package controller;

/**
 * Created by Pawel Krowicki on 2017-07-07.
 */

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import pl.com.sages.spring.bootcamp.model.Product;
//import pl.com.sages.spring.bootcamp.service.ProductService;
import services.CustomerService;

//import javax.enterprise.inject.Model;
//import javax.validation.Valid;

/**
 * Created by Pawel Krowicki on 2017-07-06.
 */

@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("show-customers.html")
    public ModelAndView getAllCustomers() {
        ModelAndView modelAndView = new ModelAndView("customers");
        modelAndView.addObject("customers", customerService.viewAllCustomers());
        return modelAndView;
    }

    @RequestMapping(value="add-customer.html", method= RequestMethod.GET)
    public ModelAndView showAddProductForm(@RequestParam(name="id", required = false) Integer id){
        if(id == null) {
            ModelAndView modelAndView = new ModelAndView("addCustomer");
            modelAndView.addObject(new Customer());
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("addCustomer");
        modelAndView.addObject(customerService.viewCustomerById(id));
        return modelAndView;
    }

    @RequestMapping(value="add-customer.html", method= RequestMethod.POST)
    public ModelAndView addCustomer(@ModelAttribute Customer customer, BindingResult bindingResult){
        Integer wrapper = customer.getId();
        if(bindingResult.hasErrors()){
            return new ModelAndView("addCustomer");
        }
        if(wrapper.equals(null)) {
            customerService.addCustomer(customer);
        } else {
            customerService.editCustomer(customer, customer.getId());
        }

        return new ModelAndView("addCustomerConfirmation", "customer",customer);
    }

}
