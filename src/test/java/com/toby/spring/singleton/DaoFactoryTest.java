package com.toby.spring.singleton;

import com.toby.spring.user.dao.DaoFactory;
import com.toby.spring.user.dao.UserDao;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class DaoFactoryTest {

    @Test
    @DisplayName("DaoFactory에서 UserDao를 가져올 때")
    public void daoFactory() {
        DaoFactory factory = new DaoFactory();
        UserDao dao1 = factory.userDao();
        UserDao dao2 = factory.userDao();

        assertThat(dao1).isNotSameAs(dao2);
    }

    @Test
    @DisplayName("Application Context에서 UserDao를 가져올 때")
    public void applicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao1 = context.getBean("userDao", UserDao.class);
        UserDao dao2 = context.getBean("userDao", UserDao.class);

        assertThat(dao1).isSameAs(dao2);
    }
}
