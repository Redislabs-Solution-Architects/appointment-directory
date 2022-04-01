package com.bestarch.demo.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class AppointmentUtil {
	
	public static final String APPOINTMENT_STATUS_NEW = "Submitted";
	
	public static final String APPOINTMENT_STATUS_APPROVED = "Approved";
	
	public static final String APPOINTMENT_STATUS_REJECTED = "Rejected";
	
	public User getUsername() {
		return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

}
