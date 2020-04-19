package com.zjut.zjxjwxk.springboot.provider.transaction;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjut.zjxjwxk.springboot.dubbo.ServiceAPI;
import org.mengyun.tcctransaction.api.Compensable;
import org.mengyun.tcctransaction.dubbo.context.DubboTransactionContextEditor;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ServiceAPI.class)
public class TransactionServiceImpl implements ServiceAPI {

    @Override
    @Compensable(confirmMethod = "confirmSendMessage", cancelMethod = "cancelSendMessage", transactionContextEditor = DubboTransactionContextEditor.class)
    public void sendMessage(String message) {
        System.out.println("this is provider sendMessage = " + message);
        if (message.equals("123")) {
            throw new NullPointerException();
        }
    }

    public void confirmSendMessage(String message) {
        System.out.println("this is provider confirmSendMessage = " + message);
    }

    public void cancelSendMessage(String message) {
        System.out.println("this is provider cancelSendMessage = " + message);
    }
}
