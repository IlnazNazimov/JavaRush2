package com.javarush.task.task15.task1522;

//import com.javarush.task.task13.task1315.Solution;

public class Earth implements Planet {
    private static Earth instance;

    private Earth(){

    }

    public static Earth getInstance(){
        if (instance==null)
            return instance = new Earth();
        else return instance;
    }
}
