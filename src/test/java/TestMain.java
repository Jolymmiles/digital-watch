import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public TestMain() {
        Locale.setDefault(new Locale("en", "US"));
    }

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMain1() {
        String data = "123";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        String expected = "2:3";
        String actual = outContent.toString().replaceAll("[\\r\\n]", "");
        assertEquals(expected, actual);
    }

    @Test
    public void testMain2() {
        String data = "755";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        String expected = "12:35";
        String actual = outContent.toString().replaceAll("[\\r\\n]", "");
        assertEquals(expected, actual);
    }

    @Test
    public void testMain3() {
        String data = "5440";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        String expected = "18:40";
        String actual = outContent.toString().replaceAll("[\\r\\n]", "");
        assertEquals(expected, actual);
    }

    @Test
    public void testMain4() {
        String data = "8704";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        String expected = "1:4";
        String actual = outContent.toString().replaceAll("[\\r\\n]", "");
        assertEquals(expected, actual);
    }

    @Test
    public void testMain5() {
        String data = "1481";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        String expected = "0:41";
        String actual = outContent.toString().replaceAll("[\\r\\n]", "");
        assertEquals(expected, actual);
    }


}