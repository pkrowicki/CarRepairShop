package rest;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CustomerService;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-11.
 */
@RestController
@RequestMapping(value = "/restCustomers") //przedRESTek xD
public class RestCustomerController {


    @Autowired
    private CustomerService customerService;


    @ResponseBody
    @RequestMapping(value = "/list")
    public List<Customer> listCustomers() {
        return customerService.viewAllCustomers();
    }

    @RequestMapping(value = "/add/{name}/{surname}/{number}")
    public String saveProduct2(@PathVariable int i, @PathVariable String name, @PathVariable String surname, @PathVariable String number){
        customerService.addCustomer(i, name, surname, number);
        return "Customer " + name + " " + surname +  " with number: " + number + " added successfully.";
    }

    @RequestMapping(value = "/addb", method = RequestMethod.POST)
    public String saveProduct3(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return "ok - " + customer.getCustomerName() + " " + customer.getCustomerSurname() + " with number: " + customer.getCustomerNumber();
    }

}