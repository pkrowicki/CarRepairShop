package dao;

import model.Part;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class PartDaoImpl implements PartDao {

    List<Part> parts;

    @Override
    public void addPart(Part part) {
        parts.add(part);
    }

    @Override
    public Part getPart(int index) {
        return parts.get(index);
    }
}
