package com.toby.spring.learningtest.template;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.*;

public class CalcSumTest {
    Calculator calculator;
    String numFilepath;

    @BeforeEach
    public void beforEach() {
        this.calculator = new Calculator();
        this.numFilepath = getClass().getResource("numbers.txt").getPath();
    }

    @Test
    public void sumOfNumbers() throws IOException {
        assertThat(this.calculator.calcSum(this.numFilepath)).isEqualTo(10);
    }

    @Test
    public void multiplyOfNumbers() throws IOException {
        assertThat(this.calculator.calcMultiply(this.numFilepath)).isEqualTo(24);
    }

    @Test
    public void concatenateStrings() throws IOException {
        assertThat(this.calculator.concatenate(this.numFilepath)).isEqualTo("1234");
    }
}
