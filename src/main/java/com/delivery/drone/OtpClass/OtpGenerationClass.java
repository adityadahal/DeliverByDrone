package com.delivery.drone.OtpClass;

import java.util.Random;

public class OtpGenerationClass {
    private  final String INPUT = "ABCDEFGHIJKLMNOPQRST0123456789abcdefghijklmnop";
    private  final Random RANDOM = new Random();

    public  String generateRandomString(Integer length){
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<length; i++){
            builder.append(INPUT.charAt(RANDOM.nextInt(INPUT.length())));
        }
        return  builder.toString();
    }

}
