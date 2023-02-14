package data.repository;

import data.Models.User;

import java.util.List;

public interface UserRepository {

    User save(User user);
    User findById(int id);
    long count();
    List<User> findAll();
    void deleteId(int Id);
    void deleteUser(User user);

    void deleteAll();
}
