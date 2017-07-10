package dao;

import model.Part;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
@Repository
public interface PartDao {
    void addPart(Part part);
    Part getPart(int id);
    List<Part> showAllParts();
}
