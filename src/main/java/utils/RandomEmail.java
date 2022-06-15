package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmail {

    public static String randomEmail(){
        return RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
    }


}
