package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.MarshalledObject;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Movie> str = new ArrayList<>();
        Movie movie;
        while ((movie = MovieFactory.getMovie(buf.readLine())) != null) {
                str.add(movie);
        }


        for (Movie s: str) {
            if (s!=null)
            System.out.println(s.getClass().getSimpleName());
        }

/*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie{

    }
}
