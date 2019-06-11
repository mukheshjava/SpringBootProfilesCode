package com.app.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.boot.notification.ProfileNotification;
@Component
public class RunnerBean implements CommandLineRunner {

	@Autowired
	private ProfileNotification notification;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Runner Run Method Started");
		System.out.println(notification.getService());
	}

}
