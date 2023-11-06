package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class GoodPairsTest extends TestCase {

    GoodPairs pair = new GoodPairs();

    @Test
    public void testNumIdenticalPairsWithoutPairs() {

        int[] nums = {1,2,3};
        int result = pair.numIdenticalPairs(nums);
        int expected = 0;

        Assert.assertEquals(expected, result);
    }


    @Test
    public void testNumIdenticalPairsWithPairs() {

        int[] nums = {1,2,3,1,1,3};
        int result = pair.numIdenticalPairs(nums);
        int expected = 4;

        Assert.assertEquals(expected, result);
    }
}