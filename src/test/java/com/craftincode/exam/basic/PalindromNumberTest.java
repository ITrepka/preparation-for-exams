package com.craftincode.exam.basic;

import com.craftincode.exams.basic.PalindromNumber;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PalindromNumberTest {
    @Test(expected = IllegalAccessException.class)
    public void isPalindromTest20202() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = PalindromNumber.class.getDeclaredMethod("isPalindrom", int.class);

        boolean result = (boolean) method.invoke(null,20202);
        Assert.assertTrue(result);
    }

    @Test(expected = IllegalAccessException.class)
    public void isPalindromTest20220() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = PalindromNumber.class.getDeclaredMethod("isPalindrom", int.class);

        boolean result = (boolean) method.invoke(null,20220);
        Assert.assertFalse(result);
    }
}
