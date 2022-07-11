package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {
    Map newMap;

    @BeforeEach
    void setUp() {
        newMap = new HashMap();
    }

    @Test
    void testThatMapArrayIsEmpty() {
        assertTrue(newMap.isEmpty());
    }

    @Test
    void testThatObjectIsAdded() {
        newMap.put("lang_1", "Java");
        assertFalse(newMap.isEmpty());
    }

    @Test
    void testThatObjectIsAdded_sizeIsTwo() {
        newMap.put("lang_1", "Java");
        newMap.put("lang_2", "Python");
        assertEquals(2, newMap.size());
    }

    @Test
    void addObject_testThatItContainsKey() {
        newMap.put("lang_1", "Java");
        newMap.put("lang_2", "Python");
        assertTrue(newMap.containsKey("lang_2"));
    }

    @Test
    void addObjectX_addObjectY_testThatItContainsValue() {
        newMap.put("lang_1", "Java");
        newMap.put("lang_2", "Python");
        assertTrue(newMap.containsValue("Java"));
    }

    @Test
    void addObjectX_getValueOfX() {
        newMap.put("lang_1", "Java");
        assertEquals("Java", newMap.get("lang_1"));
    }

    @Test
    void addObjX_objY_objZ_getKeysOfXYZ() {
        newMap.put("lang_1", "Java");
        newMap.put("lang_2", "Python");
        newMap.put("lang_2", "Python");
        newMap.put("lang_3", "Haskell");
        newMap.put("lang_3", "Haskel");
        assertEquals("lang_1, lang_2, lang_3", newMap.keySet());
    }

    @Test
    void addObjX_objY_objZ_listIsEmpty() {
        newMap.put("lang_1", "Java");
        newMap.put("lang_2", "Python");
        newMap.put("lang_3", "Haskell");
        newMap.clear();
        assertEquals(0,newMap.size());
    }

    @Test
    void addObjX_objY_objZ_objA_removeZ() {
        newMap.put("lang_1", "Java");
        newMap.put("lang_2", "Python");
        newMap.put("lang_3", "Haskell");
        newMap.put("lang_4", "JavaScript");
        newMap.remove("lang_2");
        assertEquals(3, newMap.size());
    }

    @Test
    void addObjA_objB_objC_getAllValues() {
        newMap.put("lang_1", "Java");
        newMap.put("lang_2", "Python");
        newMap.put("lang_4", "JavaScript");
        assertEquals("Java, Python, JavaScript", newMap.values());
        assertEquals("lang_1, lang_2, lang_4", newMap.keySet());

    }




}