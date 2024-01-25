package com.cydeo.tests.LMSvideos.day09_review_javafaker_driverUtils;

import com.cydeo.utilities.Singleton;
import org.testng.annotations.Test;

public class T3_SingletonPractice {

    @Test
    public void singletonTest1(){

        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str1);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str1);
    }
}
