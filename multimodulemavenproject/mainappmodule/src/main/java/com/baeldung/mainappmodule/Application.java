
package com.baeldung.mainappmodule;

import com.baeldung.daomodule.Dao;
import com.baeldung.entitymodule.User;
import com.baeldung.userdaomodule.UserDao;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author emaph
 */
public class Application {

    public static void main(String[] args) {
        System.out.println("Hello DAO Application");
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        users.put(3, new User("Carley"));
        Dao userDao = new UserDao(users);
        userDao.findAll().forEach(System.out::println);
    }
}
