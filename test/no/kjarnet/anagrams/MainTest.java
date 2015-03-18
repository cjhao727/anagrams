package no.kjarnet.anagrams;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testGetSortedChars() throws Exception {
        assertEquals("Output should be sorted string", "abc", Main.getSortedChars("cab"));
    }
}