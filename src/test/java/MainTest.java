import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import dev.arthurlunkes.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Main Test")
public class MainTest {

    @Test
    @Disabled
    @DisplayName("Test Main Method")
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        System.setOut(System.out);

        assertEquals("Hello world!\r\n", outContent.toString());
    }

}
