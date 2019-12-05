package com.craftincode.exams.intermediate.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CashService {
//    Napisz metodę do ułatwiania wydawania reszty. Dla podanej kwoty powinna zwrócić listę banknotów/monet,
//    np. dla kwoty 134 powinna zwrócić listę [100,20,10,2,2]

    public static final List<Integer> BANKNOTES = Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1);
    public static final List<Integer> PENNY = Arrays.asList(50, 20, 10, 5, 2, 1);

    public List<Integer> splitIntoBanknotes (int n) {
        if (n < 0) throw new IllegalArgumentException();
        List<Integer> denominations = new ArrayList<>();
        while (n > 0) {
            for (int i=0; i< BANKNOTES.size(); i++) {
                if (n >= BANKNOTES.get(i)) {
                    denominations.add(BANKNOTES.get(i));
                    n-=BANKNOTES.get(i);
                    i--;
                }
            }
        }
        return denominations;
    }

    public List<Double> splitIntoBanknotesWithPenny(double amount) {
        if (amount < 0) throw new IllegalArgumentException();
        List<Double> denominations = new ArrayList<>();
        amount*=100;
        while (amount >= 100) {
            for (int i=0; i< BANKNOTES.size(); i++) {
                if (amount >= BANKNOTES.get(i) * 100) {
                    denominations.add(Double.valueOf(BANKNOTES.get(i)));
                    amount-=BANKNOTES.get(i) * 100;
                    i--;
                }
            }
        }
        while (amount >= 1) {
            for (int i=0; i< PENNY.size(); i++) {
                if (amount >= PENNY.get(i)) {
                    denominations.add(Double.valueOf(PENNY.get(i)) / 100);
                    amount-=PENNY.get(i);
                    i--;
                }
            }
        }
        return denominations;
    }
}
