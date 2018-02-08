package com.infoshareacademy.jjdd3.env;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EnvironmentPrinterTest {
    IEnvironmentReader mockedReader;

    @BeforeEach
    void beforeEach() {
        mockedReader = mock(IEnvironmentReader.class);
    }

    @Test
    void shouldPrintCurrentEnvironmentOne() {
        // Given
        when(mockedReader.read()).thenReturn("TEST");
        EnvironmentPrinter printer = new EnvironmentPrinter(mockedReader);

        // When
        String message = printer.print();

        // Then
        assertEquals("Current environment is TEST", printer.print());
    }

    @Test
    void shouldPrintCurrentEnvironmentTwo() {
        when(mockedReader.read()).thenReturn("PRODUCTION");

        EnvironmentPrinter printer = new EnvironmentPrinter(mockedReader);

        assertEquals("Current environment is PRODUCTION", printer.print());
    }

}
