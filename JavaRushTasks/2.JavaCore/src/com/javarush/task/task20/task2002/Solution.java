package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("C:\\Users\\Ильназ\\Desktop\\Книгадляпроганья.txt", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            javaRush.users.add(new User());
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            boolean t = loadedObject.equals(javaRush);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(t);
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(outputStream));
            if (!users.isEmpty()) {
                for (int i = 0; i <users.size(); i++) {
                    buf.write(users.get(i).getFirstName());
                    buf.newLine();
                    buf.write(users.get(i).getLastName());
                    buf.newLine();
                    buf.write(String.valueOf(users.get(i).getBirthDate().getTime()));
                    buf.newLine();
                    buf.write(String.valueOf(users.get(i).isMale()));
                    buf.newLine();
                    buf.write(users.get(i).getCountry().getDisplayName());
                    buf.newLine();
                }
            }
            buf.flush();
            buf.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));
            String s = "";
            int i =1;
            int j = 0;
            while ((s = buf.readLine())!=null) {

                if (i==1) {
                    users.add(new User());
                    users.get(j).setFirstName(s);
                }
                if (i==2) {
                    users.get(j).setLastName(s);
                }
                if (i==3) {
                    users.get(j).setBirthDate(new Date(Long.parseLong(s)));
                }
                if (i==4) {
                    users.get(j).setMale(Boolean.parseBoolean(s));
                }
                if (i==5) {
                    if (s.equals("Russia")) {
                        users.get(j).setCountry(User.Country.RUSSIA);
                    }
                    if (s.equals("Other")) {
                        users.get(j).setCountry(User.Country.OTHER);
                    }
                    if (s.equals("Ukraine")) {
                        users.get(j).setCountry(User.Country.UKRAINE);
                    }
                }
                i++;
                if (i==6) {
                    j++;
                    i= 1;
                }
            }
            buf.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
