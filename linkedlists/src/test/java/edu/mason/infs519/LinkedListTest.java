package edu.mason.infs519;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple LinkedList.
 */
public class LinkedListTest extends TestCase
{
    public void testLength()
    {
        LinkedList testList = new LinkedList();
        testList.addToHead(1);
        int length = testList.length();
        assertEquals(1, length);
    }
    public void testAddToHead()
    {
        LinkedList testList = new LinkedList();
        testList.addToHead(1);
    }
}
