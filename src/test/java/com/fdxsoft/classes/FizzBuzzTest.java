package com.fdxsoft.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {
    private FizzBuzz game;

    @Before
    public void before(){
        game = new FizzBuzz();
    }

    @Test
    public void NotThreeOrFiveMultiples(){
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("1", numberList.get(0));
        Assert.assertEquals("2", numberList.get(1));
        Assert.assertEquals("4", numberList.get(3));
        Assert.assertEquals("13", numberList.get(12));
    }

    @Test
    public void mustReturnFizzWhenIsMultipleOf3(){
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("Fizz", numberList.get(2));
        Assert.assertEquals("Fizz", numberList.get(5));
        Assert.assertEquals("Fizz", numberList.get(8));
        Assert.assertEquals("Fizz", numberList.get(11));
        Assert.assertEquals("Fizz", numberList.get(98));
    }

    @Test
    public void mustReturnBuzzWhenIsMultipleOf5(){
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("Buzz", numberList.get(4));
        Assert.assertEquals("Buzz", numberList.get(9));
        Assert.assertEquals("Buzz", numberList.get(64));
        Assert.assertEquals("Buzz", numberList.get(99));
    }

    @Test
    public void mustReturnFizzBuzzWhenIsMultipleOf3And5(){
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("FizzBuzz", numberList.get(14));
        Assert.assertEquals("FizzBuzz", numberList.get(29));
        Assert.assertEquals("FizzBuzz", numberList.get(44));
        Assert.assertEquals("FizzBuzz", numberList.get(74));
        Assert.assertEquals("FizzBuzz", numberList.get(89));
    }
}
