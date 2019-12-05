package com.craftincode.exams.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {
//    Czynniki pierwsze to możliwie najmniejszy zbiór liczb pierwszych przy pomocy,
//    których możemy zbudować liczbę złożoną

    public List<Integer> primeFactorsOfN(int n) {
        if (n < 1) throw new IllegalArgumentException();
        if (n == 1) return Arrays.asList(n);
        List<Integer> primeFactors = new ArrayList<>();
        int counter = 2;
        while (n > 1) {
            if (n % counter == 0) {
                primeFactors.add(counter);
                n /= counter;
            } else {
                counter++;
            }
        }
        return primeFactors;
    }
}
