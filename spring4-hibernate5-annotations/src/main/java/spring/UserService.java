package spring;

import java.util.List;

import hibernate.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
