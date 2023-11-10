package org.example;

import java.util.HashSet;
import java.util.Set;

public class Jewels {

    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> uniqJewels = new HashSet<>();
        for (char ch : jewels.toCharArray())
            uniqJewels.add(ch);

        int count = 0;

        for (char c : stones.toCharArray()) {
            if (uniqJewels.contains(c))
                count++;
        }
        return count;
    }
}
