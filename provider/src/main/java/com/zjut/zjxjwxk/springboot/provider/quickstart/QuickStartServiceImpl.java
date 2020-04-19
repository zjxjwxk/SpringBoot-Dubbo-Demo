package com.zjut.zjxjwxk.springboot.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjut.zjxjwxk.springboot.dubbo.ServiceAPI;
import org.mengyun.tcctransaction.api.Compensable;
import org.springframework.stereotype.Component;

@Component
//@Service(interfaceClass = ServiceAPI.class)
public class QuickStartServiceImpl {

    @Compensable
    public String sendMessage(String message) {
        return "quickstart-provider-message=" + message;
    }
}
