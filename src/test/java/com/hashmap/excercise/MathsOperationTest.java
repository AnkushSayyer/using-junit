package com.hashmap.excercise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathsOperationTest {

    MathsOperation mathsOperation;

    @Before
    public void init(){
        mathsOperation = new MathsOperation();
    }
    @Test
    public void additionTest(){

        Assert.assertEquals(5, mathsOperation.add(2,3));
    }

    @Test
    public void additionTest2(){

        Assert.assertEquals(80, mathsOperation.add(60,20));
    }

    @Test
    public void additionTest3(){

        Assert.assertEquals(80, mathsOperation.add(60,20));
    }

    @Test
    public void subtractTest(){
        Assert.assertEquals(3, mathsOperation.subtract(5,2));
    }



}
