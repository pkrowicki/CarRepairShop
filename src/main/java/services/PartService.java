package services;

import dao.PartDao;
import model.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-05.
 */
@Repository
public class PartService {

    @Autowired
    PartDao partDao;

    public void addPart(Part part){
        partDao.addPart(part);
    }

    public void addPart(String partname, int partprice){
        Part cache = new Part(partname, partprice);
        partDao.addPart(cache);
    }

    public void deletePart(int id) {
        partDao.deletePart(id);
    }

    public Part getPart(int id){
        return partDao.getPart(id);
    }

    public void editPart(Part part, int id) {
        partDao.editPart(part, id);
    }

    public List<Part> ViewAllParts(){
        return partDao.showAllParts();
    }

}
