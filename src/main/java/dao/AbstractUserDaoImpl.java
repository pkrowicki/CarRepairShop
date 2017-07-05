package dao;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class AbstractUserDaoImpl<T> implements UserDao<T> {

    private List<T> userList;

    @Override
    public void addUser(T user) {
        userList.add((T) user);
    }

    @Override
    public void removeUser(int index) {
        userList.remove(index);

    }
}
