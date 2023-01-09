package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) { this.userDAO = userDAO; }

    @Transactional(readOnly = true)
    @Override
    public List<User> userList(int num) { return userDAO.userList(num); }

    @Transactional
    @Override
    public void save(User user) { userDAO.save(user); }

    @Transactional(readOnly = true)
    @Override
    public User getID(int id) { return userDAO.getID(id); }

    @Transactional
    @Override
    public void update(int id, User updatedUser) { userDAO.update(id, updatedUser); }

    @Transactional
    @Override
    public void delete(int id) { userDAO.delete(id); }
}