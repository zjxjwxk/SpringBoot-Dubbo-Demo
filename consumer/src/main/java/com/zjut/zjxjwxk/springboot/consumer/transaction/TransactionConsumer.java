package com.zjut.zjxjwxk.springboot.consumer.transaction;

import com.zjut.zjxjwxk.springboot.dubbo.ServiceAPI;
import org.mengyun.tcctransaction.api.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionConsumer {

    @Autowired
    private ServiceAPI serviceAPI;

    @Compensable(confirmMethod = "confirmSendMessage", cancelMethod = "cancelSendMessage", asyncConfirm = true)
    public void sendMessage(String message) {
        System.out.println("this is consumer sendMessage = " + message);
        serviceAPI.sendMessage(message);
    }

    public void confirmSendMessage(String message) {
        System.out.println("this is consumer confirmSendMessage = " + message);
        serviceAPI.sendMessage(message);
    }

    public void cancelSendMessage(String message) {
        System.out.println("this is consumer cancelSendMessage = " + message);
        serviceAPI.sendMessage(message);
    }

}
