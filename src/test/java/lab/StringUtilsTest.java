package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // ===================== reverse =====================

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

    @Test
    void reverseNull() {
        assertNull(StringUtils.reverse(null));
    }

    // ===================== isBlank =====================

    @Test
    void isBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    void isBlank_empty() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    void isBlank_spaces() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    void isBlank_notBlank() {
        assertFalse(StringUtils.isBlank("abc"));
    }

    // ===================== capitalize =====================

    @Test
    void capitalize_null() {
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    void capitalize_blank() {
        assertEquals("", StringUtils.capitalize(""));
    }

    @Test
    void capitalize_spaces() {
        assertEquals("   ", StringUtils.capitalize("   "));
    }

    @Test
    void capitalize_normal() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    void capitalize_singleChar() {
        assertEquals("A", StringUtils.capitalize("a"));
    }

    @Test
    void capitalize_alreadyCapital() {
        assertEquals("Java", StringUtils.capitalize("Java"));
    }
}