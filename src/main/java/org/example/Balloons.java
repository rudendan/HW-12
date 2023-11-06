package org.example;

public class Balloons {

    public int maxNumberOfBalloons(String text) {

        int[] frequency = new int[5];
        int[] ballon = {1, 1, 2, 2, 1};

        for (char c : text.toLowerCase().toCharArray()) {
            switch (c) {
                case 'b' -> frequency[0]++;
                case 'a' -> frequency[1]++;
                case 'l' -> frequency[2]++;
                case 'o' -> frequency[3]++;
                case 'n' -> frequency[4]++;
            }
        }

        int minInstances = Integer.MAX_VALUE;

        for (int i = 0; i < frequency.length; i++) {
            minInstances = Math.min(minInstances,frequency[i] / ballon[i]);
        }

        return minInstances;
    }
}
