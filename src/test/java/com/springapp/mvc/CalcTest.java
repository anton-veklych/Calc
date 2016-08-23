package com.springapp.mvc;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by ASUS on 22.08.2016.
 */
public class CalcTest {
    @Test
    public void testCalc() throws Exception{
        Calc calc = new Calc();
        String text = "10|+|10|+|10";
        Float f = calc.getResult(text);
        Float f2 = Float.parseFloat("30");
        Assert.assertEquals(f2, f);

        text = "10|+|10|+10";
        f = calc.getResult(text);
        f2 = Float.parseFloat("0");
        Assert.assertEquals(f2, f);

        text = "10|+|10|+-||34";
        f = calc.getResult(text);
        f2 = Float.parseFloat("0");
        Assert.assertEquals(f2, f);

        text = "10|+|10|/|0";
        f = calc.getResult(text);
        Float t = Float.POSITIVE_INFINITY;
        Assert.assertEquals(t, f);
    }
}
