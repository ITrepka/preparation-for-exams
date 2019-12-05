package com.craftincode.exams.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Primes {
    private static final int CROSSED_OUT = -1;

    public boolean isPrime(int n) {
        if (n < 2 ) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public List<Integer> primesLessThanN (int n) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public List<Integer> primesLessThanParamErastotenes(int n ) {
        int[] numbers = IntStream.of(2,n).toArray();

        for (int i = 0; numbers[i] <= Math.sqrt(n) ; i++) {
            //jeśli nie jest wykreślona, ustaw wszystkim wielokrotnosciom wartosc -1
            if (numbers[i] != CROSSED_OUT) {
                for (int j = i + numbers[i]; j < numbers.length; j+=numbers[i]) {
                    numbers[j] = CROSSED_OUT;
                }
            }
        }

        //collect all primes
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != CROSSED_OUT) {
                primes.add(numbers[i]);
            }
        }
        return primes;
    }
}
