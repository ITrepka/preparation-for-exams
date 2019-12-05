package com.craftincode.exam.intermediate.algorithms;

import com.craftincode.exams.intermediate.algorithms.Primes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PrimesTest {
    @Test
    public void isPrime_givenNLessThan2_returnsFalse(){
        Primes primes = new Primes();
        boolean result = primes.isPrime(0);
        Assert.assertFalse(result);
    }

    @Test
    public void isPrime_givenNotPrime_returnsFalse(){
        Primes primes = new Primes();
        boolean result = primes.isPrime(4);
        Assert.assertFalse(result);
    }

    @Test
    public void isPrime_givenPrime_returnsTrue(){
        Primes primes = new Primes();
        boolean result = primes.isPrime(97);
        Assert.assertTrue(result);
    }


    @Test
    public void isPrime_given2_returnsTrue(){
        Primes primes = new Primes();
        boolean result = primes.isPrime(2);
        Assert.assertTrue(result);
    }

    @Test
    public void primesLessThan_given10_returnList2357(){
        Primes primes = new Primes();
        List<Integer> result = primes.primesLessThanN(10);
        Assert.assertEquals(Arrays.asList(2,3,5,7), result);
    }

    @Test
    public void primesLessThan_given20_returnList2357_11_13_17_19(){
        Primes primes = new Primes();
        List<Integer> result = primes.primesLessThanN(20);
        Assert.assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), result);
    }

    @Test
    public void primesLessThan2_returnEmptyList(){
        Primes primes = new Primes();
        List<Integer> result = primes.primesLessThanN(2);
        Assert.assertEquals(Arrays.asList(), result);
    }

    @Test
    public void primesLessThanErastotenes_given10_returnList2357(){
        Primes primes = new Primes();
        List<Integer> result = primes.primesLessThanN(10);
        Assert.assertEquals(Arrays.asList(2,3,5,7), result);
    }

    @Test
    public void primesLessThanErastotenes_given20_returnList2357_11_13_17_19(){
        Primes primes = new Primes();
        List<Integer> result = primes.primesLessThanN(20);
        Assert.assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), result);
    }

    @Test
    public void primesLessThanErastotenes2_returnEmptyList(){
        Primes primes = new Primes();
        List<Integer> result = primes.primesLessThanN(2);
        Assert.assertEquals(Arrays.asList(), result);
    }

}
