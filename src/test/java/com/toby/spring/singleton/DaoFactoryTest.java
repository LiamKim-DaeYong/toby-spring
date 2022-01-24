package com.toby.spring.singleton;

import com.toby.spring.user.dao.DaoFactory;
import com.toby.spring.user.dao.UserDaoJdbc;
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
        UserDaoJdbc dao1 = factory.userDao();
        UserDaoJdbc dao2 = factory.userDao();

        assertThat(dao1).isNotSameAs(dao2);
    }

    @Test
    @DisplayName("Application Context에서 UserDao를 가져올 때")
    public void applicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDaoJdbc dao1 = context.getBean("userDao", UserDaoJdbc.class);
        UserDaoJdbc dao2 = context.getBean("userDao", UserDaoJdbc.class);

        assertThat(dao1).isSameAs(dao2);
    }
}
