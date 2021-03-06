package com.zjut.zjxjwxk.springboot.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjut.zjxjwxk.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QuickStartConsumer {

    @Reference(url = "dubbo://localhost:20880")
    private ServiceAPI serviceAPI;

    public void sendMessage(String message) {
        serviceAPI.sendMessage(message);
    }

}
