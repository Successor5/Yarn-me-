package data.repository;

import data.Models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private int count;
    private  List<User> users=new ArrayList<>();
    @Override
    public User save(User user) {
        boolean userHasNotBeenSaved=user.getId()==0;
        if (userHasNotBeenSaved){user.setId(generateUserId());
        user.setId(generateUserId());
            users.add(user);
        count++;}
        return user;
    }
    private int generateUserId() {
        return count+1;
    }

    @Override
    public User findById(int id) {
for (User user: users)
if (user.getId()==id)
        return user;
return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override public void deleteId(int id) {
        for (User deleteId : users) {
            if (deleteId.getId() == id) {
                users.remove(deleteId);
                count--;
                break;
            }
        }
    }
    @Override
    public void deleteUser(User user) {
        for (User user1: users){
            if (user.equals(user1)){
                users.remove(user);
                count--;
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        for (User user3 : users){
            users.remove(user3);
            count--;
            break;
        }
    }
}
