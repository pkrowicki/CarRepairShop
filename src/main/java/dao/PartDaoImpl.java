package dao;

import model.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class PartDaoImpl implements PartDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addPart(Part part) {
//        jdbcTemplate.update("INSERT INTO parts(partname, partprice) VALUES (?,?)", employee.getEmployeeName(), employee.getEmployeeSurname(), employee.getEmployeeNumber());
        //TODO finish this
    }

    @Override
    public Part getPart(int index) {
        return null;
        //TODO implement
    }
}
