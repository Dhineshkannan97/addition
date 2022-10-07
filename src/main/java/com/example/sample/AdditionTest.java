package com.example.sample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static com.example.sample.Addition.add;
import static com.example.sample.Addition.parser;

public class AdditionTest {

    @Test
    public void testAddition() {
        var result = add(1, 4);
        Assert.assertEquals(6, result);
        Assert.assertThrows(NumberFormatException.class, () -> parser("1a"));
    }

}

 class TestRunner{
      Result results= JUnitCore.runClasses(AdditionTest.class);

     public static void main(String[] args) {
         Result results= JUnitCore.runClasses(AdditionTest.class);
         for (Failure fail: results.getFailures()
              ) {
             System.out.println(fail.toString());
         }
         System.out.println(results.wasSuccessful());
     }



        }
