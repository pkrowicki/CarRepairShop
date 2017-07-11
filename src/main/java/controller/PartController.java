package controller;

/**
 * Created by Pawel Krowicki on 2017-07-07.
 */

import model.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.PartService;

/**
 * Created by Pawel Krowicki on 2017-07-06.
 */

@Controller
public class PartController {

    private PartService partService;

    @Autowired
    public PartController(PartService partService) {
        this.partService = partService;
    }

    @RequestMapping("show-parts.html")
    public ModelAndView getAllParts() {
        ModelAndView modelAndView = new ModelAndView("product");
        modelAndView.addObject("product", partService.ViewAllParts());
        return modelAndView;
    }

    @RequestMapping(value="add-part.html", method= RequestMethod.GET)
    public ModelAndView showAddProductForm(@RequestParam(name="id", required = false) Integer id, @RequestParam(name="delete", required = false) boolean delete){
        if(id == null&&delete==false) {
            ModelAndView modelAndView = new ModelAndView("addProduct");
            modelAndView.addObject(new Part());
            return modelAndView;
        } else if (id != null &&delete==true) {
            partService.deletePart(id);
            ModelAndView modelAndView = new ModelAndView("deleteConfirmation");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("addPart");
        modelAndView.addObject(partService.getPart(id));
        return modelAndView;
    }

    @RequestMapping(value="add-part.html", method= RequestMethod.POST)
    public ModelAndView addPart(@ModelAttribute Part part, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("addPart");
        }
        if(part.getId()==null) {
            partService.addPart(part);
        } else {
            partService.editPart(part, part.getId());
        }

        return new ModelAndView("addPartConfirmation", "part",part);
    }

}
