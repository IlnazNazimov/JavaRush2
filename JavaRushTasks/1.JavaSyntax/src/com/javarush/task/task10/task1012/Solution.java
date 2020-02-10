package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        Map<Character,Integer> mapi = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (int i = 0; i < alphabet.size(); i++) {
            mapi.put(alphabet.get(i),0);
        }

        for (int i = 0; i < 10; i++) {
            for (Character r: list.get(i).toCharArray()) {
                if (mapi.containsKey(r))
                    mapi.put(r, mapi.get(r) + 1);
            }
        }

        for (Map.Entry<Character, Integer> m: mapi.entrySet()) {
            if (m.getKey().equals('е')) {
                System.out.println(m.getKey() + " " + m.getValue());
                System.out.println("ё" + " " + mapi.get('ё'));
                continue;
            }
            else if (m.getKey().equals('я')) {
                System.out.println(m.getKey() + " " + m.getValue());
                break;
            }
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
