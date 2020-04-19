package com.zjut.zjxjwxk.springboot.dubbo;

import org.mengyun.tcctransaction.api.Compensable;

public interface ServiceAPI {

    @Compensable
    void sendMessage(String message);
}
