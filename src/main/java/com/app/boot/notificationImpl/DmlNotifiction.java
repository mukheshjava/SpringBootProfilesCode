package com.app.boot.notificationImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.app.boot.notification.ProfileNotification;
@Component
@Profile("DML")
public class DmlNotifiction implements ProfileNotification{

	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return "Dml Notification Profile Is Activated";
	}

}
