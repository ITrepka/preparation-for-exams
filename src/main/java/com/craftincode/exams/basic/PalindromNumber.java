package com.craftincode.exams.basic;
/*
15.	Liczba palindromiczna to taka, która czytana od przodu i od tyłu jest tą samą liczbą np. 101.
 Znajdź największą palindromiczną liczbę powstałą z iloczynu dwóch liczb trzycyfrowych
* */
public class PalindromNumber {
    public static int findMaxPalindromNumber() {
        for (int i = 999; i <= 100; i++) {
            for (int j = 999; j < 100 ; j++) {
                int product = i * j;
                if (isPalindrom(product)){
                    return product;
                }
            }
        }
        throw new RuntimeException("there is no one palindrom number");
    }

    private static boolean isPalindrom(int product) {
        String text = String.valueOf(product);
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
