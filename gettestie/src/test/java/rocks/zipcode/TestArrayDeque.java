package rocks.zipcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque
{
    ArrayDeque<Integer> newAl = new ArrayDeque();

    @org.junit.Before
    public void setUp() throws Exception {
        for (int i=0; i<10; i++)
        {
            newAl.add(i);
        }
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        //size
        assertEquals(10, newAl.size());
    }

    @Test
    public void testisEmpty() {
        //isEmpty
        assertEquals(false, newAl.isEmpty());
    }

    @Test
    public void testremoveLastOccurence()
    {
        newAl.add(1);
        newAl.add(1);
        assertEquals(12,newAl.size());
        newAl.removeLastOccurrence(1);
        assertEquals(11,newAl.size());

    }

    @Test
    public void TestPeekFirst() {
        int pf = newAl.peekFirst();
        assertEquals(0,pf);
    }

    @Test
    public void TestElement() {
        int el = newAl.element();

        assertEquals(0, el);
    }




}
