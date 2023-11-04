package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class IntegerSetTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    @DisplayName ("test if clear")
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    @DisplayName ("test length")
    public void testLength() {
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length());
    }

    @Test
    @DisplayName ("test if equal")
    public void testEquals() {
        set1.add(1);
        set1.add(2);

        set2.add(2);
        set2.add(1);

        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName ("test contains")
    public void testContains() {
        set1.add(1);
        set1.add(2);
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(3));
    }

    @Test
    @DisplayName ("test largest and smallest")
    public void testLargestAndSmallest() {
        set1.add(1);
        set1.add(3);
        set1.add(2);

        try {
            assertEquals(3, set1.largest());
            assertEquals(1, set1.smallest());
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown for non-empty set.");
        }

        // Test empty set
        set1.clear();
        try {
            set1.largest();
            set1.smallest();
            fail("Exception should be thrown for empty set.");
        } catch (IntegerSetException e) {
            // Exception should be thrown
        }
    }

    @Test
    @DisplayName ("test add")
    public void testAdd() {
        set1.add(1);
        assertTrue(set1.contains(1));
    }

    @Test
    @DisplayName ("test remove")
    public void testRemove() {
        set1.add(1);
        set1.remove(1);
        assertFalse(set1.contains(1));
    }

    @Test
    @DisplayName ("test union")
    public void testUnion() {
        set1.add(1);
        set1.add(2);

        set2.add(2);
        set2.add(3);

        set1.union(set2);

        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
    }

    @Test
    @DisplayName ("test intersect")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        set1.intersect(set2);

        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertFalse(set1.contains(1));
        assertFalse(set1.contains(4));
    }

    @Test
    @DisplayName ("test difference")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);

        set1.diff(set2);

        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(3));
    }

    @Test
    @DisplayName ("test complement")
    public void testComplement() {
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);

        set1.complement(set2);
        
        IntegerSet expected = new IntegerSet();
        expected.add(1);
        
        assertTrue(set1.equals(expected));

        // assertFalse(set1.contains(2));
        // assertFalse(set1.contains(3));
        // assertTrue(set1.contains(1));
    }
}
