package data.repository;

import data.Models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    private User user;
    private UserRepository userRepository;
    @BeforeEach
    public void setUp(){
        userRepository = new UserRepositoryImpl();
        user=new User();
        user.setFirstName("royal");
        user.setLastName("priest");
        user.setPassword("hera");
    }
@Test
    public  void saveOneUser_CountIsOneTest(){
    User user =new User();
    userRepository.save(user);
    assertEquals(1,userRepository.count());

}
@Test
    public void SaveOneUser_IdOfUserIsOneTest(){
        User savedUser = userRepository.save(user);
        assertEquals(1,savedUser.getId());

}
@Test
    public void saveTwoUsersWithSameId_countIsOneTest(){
        User savedUser = userRepository.save(user);
        assertEquals(1,userRepository.count());
        savedUser.setLastName("priestHood");
        userRepository.save(savedUser);
        assertEquals(1,userRepository.count());
}
@Test
    public void  saveOneUser_findUserByIdTest(){
        User savedUser = userRepository.save(user);
        assertEquals(1,savedUser.getId());
        User foundUser=userRepository.findById(1);
        assertEquals(foundUser,savedUser);
}
@Test
    public  void saveOneUser_DeleteOneUserId_countIsZeroTest(){
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        userRepository.deleteId(1);
        assertEquals(0, userRepository.count());
}
@Test
public void saveOneUser_deleteOneUser_byUser_countIsZeroTest(){
userRepository.save(user);
assertEquals(1,userRepository.count());
userRepository.deleteUser(user);
assertEquals(0,userRepository.count());
}
@Test
    public void saveUser_deleteAllUsers_countIsEmpty(){
        userRepository.save(user);
        assertEquals(1,userRepository.count());
        userRepository.deleteAll();
        assertEquals(0,userRepository.count());
}
}