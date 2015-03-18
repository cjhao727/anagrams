package no.kjarnet.anagrams;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testGetSortedChars() throws Exception {
        assertEquals("Output should be sorted string", "abc", Main.getSortedChars("cab"));
    }

    @Test
    public void testGetJoinOfMultipleStrings() throws Exception {
        Map<String, List<String>> groupedStrings = new HashMap<>();
        List<String> listA = Arrays.asList("This", "is", "the", "first", "test");
        List<String> listB = Arrays.asList("Here", "comes", "the", "second", "test");
        groupedStrings.put("a", listA);
        groupedStrings.put("b", listB);
        List<String> concatenated = Main.getJoinOfMultipleStrings(groupedStrings);
        assertEquals("First list item should be listA concatenated", "This,is,the,first,test", concatenated.get(0));
        assertEquals("Second list item should be listB concatenated", "Here,comes,the,second,test", concatenated.get(1));
    }
}