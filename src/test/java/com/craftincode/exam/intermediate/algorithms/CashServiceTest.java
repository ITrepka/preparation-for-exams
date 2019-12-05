package com.craftincode.exam.intermediate.algorithms;

import com.craftincode.exams.intermediate.algorithms.CashService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CashServiceTest {
    @Test
    public void splitIntoBanknotes134Test() {
        CashService cashService = new CashService();
        List<Integer> banknotes = cashService.splitIntoBanknotes(134);
        Assert.assertEquals(Arrays.asList(100, 20, 10, 2, 2), banknotes);
    }

    @Test
    public void splitIntoBanknotesWithPenny134_84(){
        CashService cashService = new CashService();
        List<Double> banknotesWithPenny = cashService.splitIntoBanknotesWithPenny(134.84);
        Assert.assertEquals(Arrays.asList(100d, 20d, 10d, 2d, 2d, 0.5, 0.2, 0.1, 0.02, 0.02), banknotesWithPenny);
    }
}
