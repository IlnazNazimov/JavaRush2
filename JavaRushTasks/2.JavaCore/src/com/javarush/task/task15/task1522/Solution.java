package com.javarush.task.task15.task1522;
//import com.javarush.task.task13.task1315.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String ss = buf.readLine();
            if (ss.equals(Planet.EARTH))
                thePlanet = Earth.getInstance();
            else if (ss.equals(Planet.MOON))
                thePlanet = Moon.getInstance();
            else if (ss.equals(Planet.SUN))
                thePlanet = Sun.getInstance();
            else thePlanet = null;
        } catch (Exception e){

        }
    }
}
