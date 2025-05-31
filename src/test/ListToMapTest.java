package test;

import adapter.ListToMap;
import interfacesExamples.ExampleMap;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class ListToMapTest {

    @Test
    public void testPutAndGet() {
        List<String> mod5_3 = new ArrayList<>();
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        adapter.put(0, "Maca");
        adapter.put(1, "Banana");

        assertEquals("Maca", adapter.get(0));
        assertEquals("Banana", adapter.get(1));
    }

    @Test
    public void testRemove() {
        List<String> mod5_3 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        String mod5_1 = adapter.remove(1);
        assertEquals("B", mod5_1);
        assertEquals(2, adapter.size());
    }

    @Test
    public void testContainsKeyAndValue() {
        List<String> mod5_3 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        assertTrue(adapter.containsKey(1));
        assertFalse(adapter.containsKey(5));

        assertTrue(adapter.containsValue("A"));
        assertFalse(adapter.containsValue("X"));
    }

    @Test
    public void testClearAndIsEmpty() {
        List<String> mod5_3 = new ArrayList<>(Arrays.asList("A", "B"));
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        assertFalse(adapter.isEmpty());
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    public void testSizeAndValues() {
        List<String> mod5_3 = new ArrayList<>(Arrays.asList("X", "Y"));
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        assertEquals(2, adapter.size());
        assertTrue(adapter.values().contains("X"));
        assertTrue(adapter.values().contains("Y"));
    }

    @Test
    public void testEquals() {
        List<String> mod5_0 = new ArrayList<>(Arrays.asList("A", "B"));
        List<String> mod5_2 = new ArrayList<>(Arrays.asList("A", "B"));

        ExampleMap<Integer, String> adapter1 = new ListToMap<>(mod5_0);
        ExampleMap<Integer, String> adapter2 = new ListToMap<>(mod5_2);

        assertTrue(adapter1.equals(adapter2));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testListaNula() {
        ExampleMap<Integer, String> adapter1 = new ListToMap<>(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testContainsKeyError() {
        List<String> mod5_3 = new ArrayList<>();
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        adapter.containsKey(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testContainsValueError(){
        List<String> mod5_3 = new ArrayList<>();
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        adapter.containsValue(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPutError() {
        List<String> mod5_3 = new ArrayList<>();
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        adapter.put(0, null);
        adapter.put(null, "Maca");
    }



    @Test (expected = IllegalArgumentException.class)
    public void testGetErrorIllegal(){
        List<String> mod5_3 = new ArrayList<>();
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        adapter.get(null);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetErrorIndexOf(){
        List<String> mod5_3 = new ArrayList<>();
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        adapter.get(10);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveErrorIllegal() {
        List<String> mod5_3 = new ArrayList<>();
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        adapter.remove(null);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemoveErrorIndexOf() {
        List<String> mod5_3 = new ArrayList<>();
        ExampleMap<Integer, String> adapter = new ListToMap<>(mod5_3);

        adapter.remove(10);
    }
}
