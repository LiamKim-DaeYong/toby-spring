package com.toby.spring.learningtest.junit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration
public class JUnitTest {
    @Autowired
    ApplicationContext context;

    static Set<JUnitTest> testObjects = new HashSet<JUnitTest>();
    static ApplicationContext contextObject = null;

    @Test
    public void test1() {
        assertThat(this).doesNotHaveSameClassAs(testObjects);
        testObjects.add(this);

        assertThat(contextObject == null || contextObject == this.context).isEqualTo(true);
        contextObject = this.context;
    }

    @Test
    public void test2() {
        assertThat(this).doesNotHaveSameClassAs(testObjects);
        testObjects.add(this);

        assertThat(contextObject == null || contextObject == this.context).isEqualTo(true);
        contextObject = this.context;
    }

    @Test
    public void test3() {
        assertThat(this).doesNotHaveSameClassAs(testObjects);
        testObjects.add(this);

        assertThat(contextObject == null || contextObject == this.context).isEqualTo(true);
        contextObject = this.context;
    }
}
