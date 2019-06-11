package com.app.boot.notificationImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.app.boot.notification.ProfileNotification;

@Component
@Profile("HTC")
public class HTCNotification implements ProfileNotification{

	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return "HTC Notification Profile Is Activated";
	}

}
