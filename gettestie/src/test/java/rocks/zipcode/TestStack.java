package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<String> stack = new Stack<>();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {

        stack.push("Hello world");

        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
}
