package com.axess.smartbankapi.consumer;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
//import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
//import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;
import com.axess.smartbankapi.email.AmazonSESSample;

import com.axess.smartbankapi.model.Message;

@Component
//@Slf4j
public class Consumer {

    @SqsListener(value = "rajat-queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void processMessage(Message message) {
    System.out.println("Consumer " + message);
    
    try {
		AmazonSESSample.send(message);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}

