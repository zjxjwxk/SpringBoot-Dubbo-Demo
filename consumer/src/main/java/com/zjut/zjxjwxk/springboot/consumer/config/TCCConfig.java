package com.zjut.zjxjwxk.springboot.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zjxjwxk
 */
@Configuration
@ImportResource(locations = {"classpath:tcc-transaction.xml", "classpath:tcc-transaction-dubbo.xml"})
public class TCCConfig {


}
