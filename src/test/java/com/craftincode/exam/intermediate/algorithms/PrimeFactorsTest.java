package com.craftincode.exam.intermediate.algorithms;

import com.craftincode.exams.intermediate.algorithms.PrimeFactors;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PrimeFactorsTest {
    @Test
    public void primeFactorsOfNTest4() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> factors = primeFactors.primeFactorsOfN(4);
        Assert.assertEquals(factors, Arrays.asList(2,2));
    }

    @Test
    public void primeFactorsOfNTest18() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> factors = primeFactors.primeFactorsOfN(18);
        Assert.assertEquals(factors, Arrays.asList(2, 3, 3));
    }
}
