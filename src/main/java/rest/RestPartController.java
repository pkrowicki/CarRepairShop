package rest;

import model.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.PartService;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-10.
 */


@RestController
@RequestMapping(value = "/restParts") //przedRESTek xD
public class RestPartController {


    @Autowired
    private PartService partService;


    @ResponseBody
    @RequestMapping(value = "/list")
    public List<Part> listProduct() {
        return partService.ViewAllParts();
    }

    @RequestMapping(value = "/add/{name}/{price}")
    public String saveProduct2(@PathVariable String name, @PathVariable int price){
        partService.addPart(name, price);
        return "Part " + name + ", " + "price: " + price + " added successfully.";
    }

    @RequestMapping(value = "/addb", method = RequestMethod.POST)
    public String saveProduct3(@RequestBody Part part){
        partService.addPart(part);
        return "ok - " + part.getPartName() + ", " + "price: " + part.getPartPrice();
    }

}
