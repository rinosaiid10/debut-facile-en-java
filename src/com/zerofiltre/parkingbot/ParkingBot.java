package com.zerofiltre.parkingbot;

import java.util.Arrays;
import java.util.List;

public class ParkingBot {

    public static void main(String[] args) {

        List<Integer>numbers = Arrays.asList(1,2,3,4,5);

        for (Integer number : numbers) {

            if (number % 2 == 0) {
                System.out.println(" nombre est paire " + number);
            } else {
                System.out.println(" nombre est impaire " + number);
            }

        }
    }
}
