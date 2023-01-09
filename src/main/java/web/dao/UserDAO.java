package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {
    List<User> userList(int num);
    void save(User user);
    User getID(int id);
    void update(int id, User updatedUser);
    void delete(int id);

}
