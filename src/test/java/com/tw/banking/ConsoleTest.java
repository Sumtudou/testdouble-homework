package com.tw.banking;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

class ConsoleTest {

    @Test
    void should_invoke_println_line_hello_when_call_printLine_given_hello() {
        PrintStream spyPrintStream = mock(PrintStream.class);
        System.setOut(spyPrintStream);
        Console console = new Console();

        console.printLine("hello Thomas");

        verify(spyPrintStream, times(1)).println("hello Thomas");
    }
}
