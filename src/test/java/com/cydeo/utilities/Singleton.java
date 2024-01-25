package com.cydeo.utilities;

public class Singleton {


    //1. Create private constructor
    private void Singleton(){}
    //2. Create private static String
    private static String word;  // by default word is null

    //3. Create a method to return the 'private String' we just created
    public static String getWord () {

        if ( word == null ){
            System.out.println("First time call. Word object is null");
            System.out.println("Assigning value to it now.");
            word= "Hello World";
        }else{
            System.out.println("Word: already has a value 'Hello World'");
        }
        return word;
    }




}
