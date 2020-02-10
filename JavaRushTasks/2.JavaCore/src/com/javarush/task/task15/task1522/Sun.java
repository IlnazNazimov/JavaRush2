package com.javarush.task.task15.task1522;
//import com.javarush.task.task13.task1315.Solution;

public class Sun implements Planet {
    private static Sun instance;

    private Sun(){

    }

    public static Sun getInstance(){
        if (instance==null)
            return instance = new Sun();
        else return instance;
    }
}
