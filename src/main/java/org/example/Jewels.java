package org.example;

import java.util.HashSet;
import java.util.Set;

public class Jewels {

    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewel = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            jewel.add(ch);
        }

        int count = 0;

        for (char c : stones.toCharArray()) {
            if (jewel.contains(c))
                count++;
        }
        return count;
    }
}
