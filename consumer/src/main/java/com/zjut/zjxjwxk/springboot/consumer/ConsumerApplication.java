package com.zjut.zjxjwxk.springboot.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.zjut.zjxjwxk.springboot.consumer.quickstart.QuickStartConsumer;
import com.zjut.zjxjwxk.springboot.consumer.transaction.TransactionConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);

//        QuickStartConsumer quickStartConsumer = (QuickStartConsumer) run.getBean("quickStartConsumer");
//        quickStartConsumer.sendMessage("Hello World!");

        // 测试分布式事务
        TransactionConsumer transactionConsumer = (TransactionConsumer) run.getBean("transactionConsumer");
        transactionConsumer.sendMessage("Hello");
    }

}
