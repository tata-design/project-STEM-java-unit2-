package com.tatadesign.stem;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.Test;

public class AppTest {
    @Test
    public void mainPrintsGreeting() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));
            App.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("Hello World!" + System.lineSeparator(), output.toString(StandardCharsets.UTF_8));
    }
}
