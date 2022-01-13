package com.toby.spring.user.dao;

import com.toby.spring.user.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    UserDao userDao = new UserDao();

    @BeforeEach
    public void beforeEach() throws SQLException, ClassNotFoundException {
        userDao.deleteAll();
    }

    @Test
    public void daoTest() throws SQLException, ClassNotFoundException {
        User user = new User();
        user.setId("id_1");
        user.setName("user1");
        user.setPassword("password");
        userDao.add(user);

        User user2 = userDao.get(user.getId());
        Assertions.assertThat(user.getId()).isEqualTo(user2.getId());
    }
}
