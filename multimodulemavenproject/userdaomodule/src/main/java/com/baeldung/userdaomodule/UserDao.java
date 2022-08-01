
package com.baeldung.userdaomodule;

import com.baeldung.daomodule.Dao;
import com.baeldung.entitymodule.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author emaph
 */
public class UserDao implements Dao<User> {

    private final Map<Integer, User> users;

    public UserDao() {
        this.users = new HashMap<>();
    }

    public UserDao(Map<Integer, User> users) {
        this.users = users;
    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

}
