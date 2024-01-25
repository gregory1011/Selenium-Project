package com.cydeo.tests.LMSvideos.day08_Properties_ConfigReaders;

import org.testng.annotations.Test;

public class LearningProperties {

    // Java is tracking some info about our computer, our project, and username..
    // Let's print them out

    @Test
    public void testProperties(){
        // key = value
        // we pass the key, it will return the value
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }
}
