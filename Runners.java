/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coursework.oopcoursework;

/**
 *
 * @author kyagulanyi
 */

import java.util.HashMap;
import java.util.Map;

public class Runners {
    public static void main(String[] args) {
        
        //  runner names and times
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        //  names with times
        Map<String, Integer> runnerTimes = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            runnerTimes.put(names[i], times[i]);
        }

        //   runners Variables
        String fastestRunner = "";
        String secondFastestRunner = "";
        int fastestTime = Integer.MAX_VALUE;
        int secondFastestTime = Integer.MAX_VALUE;

        // finding the fastest and the second 
        for (Map.Entry<String, Integer> entry : runnerTimes.entrySet()) {
            int currentTime = entry.getValue();
            String currentName = entry.getKey();

            if (currentTime < fastestTime) {
                // Update second fastest
                secondFastestTime = fastestTime;
                secondFastestRunner = fastestRunner;

                //  fastest runner
                fastestTime = currentTime;
                fastestRunner = currentName;
            } else if (currentTime < secondFastestTime && currentTime != fastestTime) {
                // 2nd runner
                secondFastestTime = currentTime;
                secondFastestRunner = currentName;
            }
        }

        
        System.out.println("The fastest Runner is: " + fastestRunner + " with " + fastestTime + " minutes.");
        System.out.println("The Second fastest Runner is: " + secondFastestRunner + " with " + secondFastestTime + " minutes.");
    }
}
