package com.cydeo.tests.LMSvideos.day09_review_javafaker_driverUtils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {


    @Test

    public void test1(){
        // create java faker object
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());
        System.out.println("faker.address().cityName() = " + faker.address().cityName());
        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());

        System.out.println("faker.numerify(\"617-###-####\") = " + faker.numerify("617-###-####"));
        System.out.println("faker.numerify(\"617-###-####\") = " + faker.numerify("617-###-####"));
        System.out.println("faker.numerify(\"617-###-####\") = " + faker.numerify("617-###-####"));

        System.out.println("faker.numerify(\"####-####-####-####\") = " + faker.numerify("####-####-####-####"));

        System.out.println("faker.letterify(\"???????????????????\") = " + faker.letterify("???????????????????"));

        System.out.println("faker.bothify(\"##??-##434-???###-####\") = " + faker.bothify("##??-##434???#######"));

        System.out.println("faker.chuckNorris() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris() = " + faker.chuckNorris().fact().replace("Chuck Norris", "Muhtar"));


    }
}
