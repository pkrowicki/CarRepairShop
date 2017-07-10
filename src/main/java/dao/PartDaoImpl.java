package dao;

import model.Customer;
import model.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class PartDaoImpl implements PartDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addPart(Part part) {
        jdbcTemplate.update("INSERT INTO parts(partname, partprice) VALUES (?,?)", part.getPartName(), part.getPartPrice());

    }

    @Override
    public Part getPart(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM customers WHERE id = ?", getCustomerRowMapper(),id);
    }

    @Override
    public List<Part> showAllParts() {
        return jdbcTemplate.query("SELECT * FROM parts", getCustomerRowMapper());
    }

    private RowMapper<Part> getCustomerRowMapper(){
        return new RowMapper<Part>() {
            @Override
            public Part mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String partname = resultSet.getString("partname");
                int partprice = resultSet.getInt("partprice");

                return new Part(partname,partprice);
            }
        };
    }

}
