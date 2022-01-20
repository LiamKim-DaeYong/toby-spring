package com.toby.spring.learningtest.template;

public interface LineCallback<T> {
    T doSomethingWithLine(String line, T value);
}
