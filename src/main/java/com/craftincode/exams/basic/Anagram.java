package com.craftincode.exams.basic;

//Napisz ciało poniższej metody, która sprawdza czy word1 jest anagramem word2 (anagram jest to słowo utworzone z liter innego
//słowa, gdzie każda z liter może być wykorzystana tylko raz np.wiatr jest anagramem słowa klawiatura, natomiast wiatraki już nie


public class Anagram {
    public static boolean anagram(String word1, String word2) {
        String text = word1.toLowerCase();
        String text2 = word2.toLowerCase();
        for (String letter : text.split("")) {
            if (text2.contains(letter)) {
                text2 = text2.replaceFirst(letter, "");
            }else {
              return false;
            }
        }
        return true;
    }
}
