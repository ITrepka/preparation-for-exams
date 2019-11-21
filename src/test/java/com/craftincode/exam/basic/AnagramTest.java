package com.craftincode.exam.basic;

import com.craftincode.exams.basic.Anagram;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    @Test
    public void isWiatrAnagramOfKlawiatura(){
        boolean result = Anagram.anagram("wiatr", "klawiatura");
        Assert.assertTrue(result);
    }

    @Test
    public void isWiatrakiAnagramOfKlawiatura(){
        boolean result = Anagram.anagram("wiatraki", "klawiatura");
        Assert.assertFalse(result);
    }
}
