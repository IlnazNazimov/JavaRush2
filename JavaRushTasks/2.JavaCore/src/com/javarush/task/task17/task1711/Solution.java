package com.javarush.task.task17.task1711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");

        switch (args[0]) {
            case ("-c"): {
                for (int i = 0; i < args.length/3; i++) {
                    C(args[3*i + 1], args[3*i + 2], dateFormat.parse(args[3*i + 3]));
                }
                break;
            }
            case ("-u"): {
                for (int i = 0; i < args.length/4; i++) {
                    U(Integer.parseInt(args[4*i + 1]), args[4*i + 2], args[4*i + 3], dateFormat.parse(args[4*i +4]));
                }
                break;
            }
            case ("-d"): {
                for (int i = 1; i <= args.length - 1; i++) {
                    D(Integer.parseInt(args[i]));
                }
                break;
            }
            case ("-i"): {
                for (int i = 1; i <= args.length - 1; i++) {
                    I(Integer.parseInt(args[i]));
                }
            }
        }
    }

    public synchronized static void C(String name, String sex, Date date) {
        if (sex.equals("м"))
            allPeople.add(Person.createMale(name,date));
        else if (sex.equals("ж"))
            allPeople.add(Person.createFemale(name,date));
        System.out.println( allPeople.size()-1);
    }

    public synchronized static void U(int id, String name, String sex, Date date) {
        Person person = allPeople.get(id);
        person.setName(name);
        if (sex.equals("м"))
            person.setSex(Sex.MALE);
        else if (sex.equals("ж"))
            person.setSex(Sex.FEMALE);
        person.setBirthDate(date);
    }

    public synchronized static void D(int id) {
        Person person = allPeople.get(id);

        person.setBirthDate(null);
        person.setSex(null);
        person.setName(null);
    }

    public synchronized static void I(int id) {
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
