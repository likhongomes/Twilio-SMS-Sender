/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twilioproject;

// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


/**
 *
 * @author likhongomes
 */
public class SmsSender {
    
    public static final String ACCOUNT_SID =
            "AC096ddc3322b4235c147a746cc4c6eb47";
    public static final String AUTH_TOKEN =
            "53c7ea8b5c23b050c1414137f15dae98";
    
    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+12406156788"), // to
                        new PhoneNumber("+16282401644"), // from
                        "Yoo What's up Ma Boi?")
                .create();

        System.out.println(message.getSid());
    }
}
