package com.cydeo.tests.LMSvideos.day08_Properties_ConfigReaders;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readingProperties {

    @Test
    public void readingPropertiesText() throws IOException {

        // create object of Properties
        Properties properties = new Properties();

        // open the file in Java memory using FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        // load the properties file in the Properties object
        properties.load(file);

        // use the "properties" object to read value from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.get(\"env\") = " + properties.get("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));



    }

}
