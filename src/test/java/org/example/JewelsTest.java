package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class JewelsTest extends TestCase {

    private Jewels jewel = new Jewels();

    @Test
    public void testNumJewelsInStonesWithTwoJewels(){

        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;

        int result = jewel.numJewelsInStones(jewels, stones);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNumJewelsInStonesIfDifferentInRegistr(){

        String jewels = "z";
        String stones = "ZZ";
        int expected = 0;

        int result = jewel.numJewelsInStones(jewels, stones);
        Assert.assertEquals(expected, result);
    }
}