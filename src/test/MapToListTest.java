package test;

import adapter.MapToList;
import interfacesExamples.ExampleList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class MapToListTest {

    @Test
    public void testAddAndGet() {
        Map<Integer, String> mod6_4 = new HashMap<>();
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        adapter.add("João");
        adapter.add("Maria");

        assertEquals("João", adapter.get(0));
        assertEquals("Maria", adapter.get(1));
    }

    @Test
    public void testRemove() {
        Map<Integer, String> mod6_4 = new HashMap<>();
        mod6_4.put(0, "A");
        mod6_4.put(1, "B");
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        String mod6_0 = adapter.remove(1);
        assertEquals("B", mod6_0);
        assertThrows(IndexOutOfBoundsException.class, () -> adapter.get(1));
    }

    @Test
    public void testContains() {
        Map<Integer, String> mod6_4 = new HashMap<>();
        mod6_4.put(0, "A");
        mod6_4.put(1, "B");
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        assertTrue(adapter.contains("A"));
        assertFalse(adapter.contains("X"));
    }

    @Test
    public void testClearAndIsEmpty() {
        Map<Integer, String> mod6_4 = new HashMap<>();
        mod6_4.put(0, "A");
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        assertFalse(adapter.isEmpty());
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    public void testSizeAndToArray() {
        Map<Integer, String> mod6_4 = new HashMap<>();
        mod6_4.put(0, "X");
        mod6_4.put(1, "Y");
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        assertEquals(2, adapter.size());
        Object[] array = adapter.toArray();
        assertTrue(Arrays.asList(array).contains("X"));
        assertTrue(Arrays.asList(array).contains("Y"));
    }

    @Test
    public void testIterator() {
        Map<Integer, String> mod6_4 = new HashMap<>();
        mod6_4.put(0, "A");
        mod6_4.put(1, "B");
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        List<String> mod6_2 = new ArrayList<>();
        for (String mod6_5 : adapter) {
            mod6_2.add(mod6_5);
        }

        assertTrue(mod6_2.contains("A"));
        assertTrue(mod6_2.contains("B"));
    }

    @Test
    public void testEquals() {
        Map<Integer, String> mod6_3 = new HashMap<>();
        mod6_3.put(0, "A");
        mod6_3.put(1, "B");

        Map<Integer, String> mod6_1 = new HashMap<>();
        mod6_1.put(0, "A");
        mod6_1.put(1, "B");

        ExampleList<String> adapter1 = new MapToList<>(mod6_3);
        ExampleList<String> adapter2 = new MapToList<>(mod6_1);

        assertTrue(adapter1.equals(adapter2));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMapaNulo(){
        ExampleList<String> adapter = new MapToList<>(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddError(){
        Map<Integer, String> mod6_4 = new HashMap<>();
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        adapter.add(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testContainsError(){
        Map<Integer, String> mod6_4 = new HashMap<>();
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        adapter.contains(null);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetError(){
        Map<Integer, String> mod6_4 = new HashMap<>();
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        adapter.get(-1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemoveError(){
        Map<Integer, String> mod6_4 = new HashMap<>();
        ExampleList<String> adapter = new MapToList<>(mod6_4);

        adapter.remove(-1);
    }
}

