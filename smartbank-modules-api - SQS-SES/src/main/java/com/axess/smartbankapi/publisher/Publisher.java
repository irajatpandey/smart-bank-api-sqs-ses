package com.axess.smartbankapi.publisher;
import com.axess.smartbankapi.model.Message;

import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.axess.smartbankapi.model.Message;

@Component
public class Publisher {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Value("${cloud.aws.end-point.uri}")
    private String endpoint;
    
    Message msg;
//    @Scheduled(fixedRate = 100000)
    public void scheduleFixedRateTask(Message message) {
    	System.out.println("Publisher");
       try {
//    	  
           queueMessagingTemplate.convertAndSend(endpoint, message);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}