package com.javarush.task.task08.task0816;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне1", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("June 12 2012"));
        map.put("Сталлоне3", dateFormat.parse("April 2 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 3 2012"));
        map.put("Сталлоне5", dateFormat.parse("June 4 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 5 2012"));
        map.put("Сталлоне7", dateFormat.parse("June 13 2012"));
        map.put("Сталлоне8", dateFormat.parse("April 21 2012"));
        map.put("Сталлоне9", dateFormat.parse("June 12 2012"));
        map.put("Сталлоне10", dateFormat.parse("April 11 2012"));

        return  map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> d = map.entrySet().iterator();
        while (d.hasNext())
        {
           Map.Entry<String, Date> s = d.next();
           if (s.getValue().getMonth()==Calendar.JUNE || s.getValue().getMonth()==Calendar.JULY || s.getValue().getMonth()==Calendar.AUGUST)
               d.remove();
        }

        /*for (Map.Entry<String, Date> value: map.entrySet()) {
            if(value.getValue().getMonth()==5 ||value.getValue().getMonth()==6 ||value.getValue().getMonth()==7 )
                map.remove(value);
        }*/

    }

    public static void main(String[] args) {

    }
}
