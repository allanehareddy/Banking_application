package com.example.neha.utils;

import java.time.Year;

public  class AccountUtils {
   public static final String ACCOUNT_CREATION_SUCCESS="002";
    public static final String ACCOUNT_CREATION_MESSAGE="account has been created";
    public static final String ACCOUNT_EXISTS_CODE="001";
    public static final String ACCOUNT_EXISTS_MESSAGE="This user already has an account";
    public static String generateAccountNumber(){

        Year CurrentYear =  Year.now();
        int min = 1000000;
        int max=9999999;
        int randNumber=(int) Math.floor(Math.random()*(max-min+1)+min);
        String year = String.valueOf(CurrentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();
    }

}
