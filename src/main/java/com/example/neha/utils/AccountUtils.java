package com.example.neha.utils;

import java.time.Year;

public  class AccountUtils {
   public static final String ACCOUNT_CREATION_SUCCESS="002";
    public static final String ACCOUNT_CREATION_MESSAGE="account has been created";
    public static final String ACCOUNT_DEBITED_SUCCESS="005";
    public static final String ACCOUNT_DEBITED_MESSAGE="account has been debited";
    public static final String ACCOUNT_CREDIT_SUCCESS="004";
    public static final String ACCOUNT_CREDIT_MESSAGE="account has been credited";
    public static final String INSUFFICIENT_BALANCE_CODE="004";
    public static final String INSUFFICIENT_BALANCE_MESSAGE="account has been credited";

    public static final String ACCOUNT_EXISTS_CODE="001";
    public static final String ACCOUNT_NOTEXISTS_CODE="002";
    public static final String ACCOUNT_NOTEXISTS_MESSAGE="We can create new account";

    public static final String ACCOUNT_FOUND_CODE="003";
    public static final String ACCOUNT_FOUND_MESSAGE="We found your account";

    public static final String ACCOUNT_EXISTS_MESSAGE="This user already has an account";
    public static final String TRANSFER_SUCCESS_CODE = "006";
    public static final String TRANSFER_SUCCESS_MESSAGE = "successfully transferred";

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
