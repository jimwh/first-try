package lab.sec.service;

import lab.sec.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    public List<User> getUserList() {

        // preparing user list with few hard coded values
        List<User> userList = new ArrayList<User>();

        userList.add(new User(1, "user_a", "user_a@example.com", "9898989898"));
        userList.add(new User(2, "user_b", "user_b@example.com", "9767989898"));
        userList.add(new User(3, "user_c", "user_c@example.com", "9898459898"));

        return userList;
    }

}
