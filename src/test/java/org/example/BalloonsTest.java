package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BalloonsTest extends TestCase {

    private Balloons balloon = new Balloons();

    @Test
    public void testMaxNumberOfBalloonsWithOneMatch() {

        String wordToTest = "nlaebolko";
        int expected = 1;

        int result = balloon.maxNumberOfBalloons(wordToTest);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMaxNumberOfBalloonsWithSeveralMatches() {

         String text = "loonbalxballpoon";


        int result = balloon.maxNumberOfBalloons(text);
        int expected = 2;

        Assert.assertEquals(expected, result);
    }
}