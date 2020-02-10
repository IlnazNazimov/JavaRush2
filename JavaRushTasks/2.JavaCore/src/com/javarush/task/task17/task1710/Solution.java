package com.javarush.task.task17.task1710;

import com.sun.javafx.scene.control.skin.IntegerFieldSkin;
import sun.text.resources.FormatData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");

        switch (args[0]) {
            case ("-c"): {
                C(args[1], args[2], dateFormat.parse(args[3]));
                break;
            }
            case ("-u"): {
                U(Integer.parseInt(args[1]), args[2], args[3], dateFormat.parse(args[4]));
                break;
            }
            case ("-d"): {
                D(Integer.parseInt(args[1]));
                break;
            }
            case ("-i"): {
                I(Integer.parseInt(args[1]));
            }
        }
    }

    public static void C(String name, String sex, Date date) {
        if (sex.equals("м"))
            allPeople.add(Person.createMale(name,date));
        else if (sex.equals("ж"))
            allPeople.add(Person.createFemale(name,date));
        System.out.println( allPeople.size()-1);
    }

    public static void U(int id, String name, String sex, Date date) {
        Person person = allPeople.get(id);
        person.setName(name);
        if (sex.equals("м"))
            person.setSex(Sex.MALE);
        else if (sex.equals("ж"))
            person.setSex(Sex.FEMALE);
        person.setBirthDate(date);
    }

    public static void D(int id) {
        Person person = allPeople.get(id);

        person.setBirthDate(null);
        person.setSex(null);
        person.setName(null);
    }

    public static void I(int id) {
        Person person = allPeople.get(id);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String date = null;
        String sex = null;

        if (person.getSex()==Sex.MALE)
            sex = "м";
        else if (person.getSex()==Sex.FEMALE)
            sex = "ж";

        if (person.getBirthDate()!=null) {
            date = simpleDateFormat.format(person.getBirthDate());
        }
        System.out.println(person.getName() + " " + sex + " " + date);
    }
}
