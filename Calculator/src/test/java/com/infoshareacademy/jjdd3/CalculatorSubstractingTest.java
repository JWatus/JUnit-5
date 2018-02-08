package com.infoshareacademy.jjdd3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSubstractingTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data_to_calculate.csv"}, delimiter = ';')
    void shouldSubstractNumberBFromNumberA(int a, int b, int c) {
        assertEquals(Calculator.substract(a, b), c);
    }
}
