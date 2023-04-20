package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override

    public List<User> findAllUser() {
        return userDAO.index();
    }

    @Override

    public User findUserById(int id) {
        return userDAO.show(id);
    }

    @Override

    public void saveUserByUser(User user) {
        userDAO.save(user);
    }

    @Override

    public void updateUserByUserAndId(User user, int id) {
        userDAO.update(user, id);
    }

    @Override

    public void deleteUserById(int id) {
        userDAO.delete(id);
    }
}
