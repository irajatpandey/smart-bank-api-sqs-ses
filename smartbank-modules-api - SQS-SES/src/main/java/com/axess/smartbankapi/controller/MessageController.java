package com.axess.smartbankapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axess.smartbankapi.model.Message;
import com.axess.smartbankapi.publisher.Publisher;

@RestController
public class MessageController {

	@Autowired
	Publisher publisher;
	@PostMapping("/sendemail")
	public boolean sendEmail(@RequestBody Message message) {
		System.out.println("MessageController " + message);
// 	   Message message  =  new Message();

		publisher.scheduleFixedRateTask(message);
		return true;
		
	}
}
