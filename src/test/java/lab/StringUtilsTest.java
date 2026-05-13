package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void reverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverseSingleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverseAsciiString() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    void reverseUnicodeString() {
        assertEquals("тевС", StringUtils.reverse("Свет"));
    }
}