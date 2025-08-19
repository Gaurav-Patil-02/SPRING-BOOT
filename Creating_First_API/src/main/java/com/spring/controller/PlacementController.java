package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placements")
public class PlacementController {
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard() {
		return "Dashboard Page";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public String profile() {
		return "My Profile";
	}
	
	@RequestMapping(value = "/announcements", method = RequestMethod.DELETE)
	public String announcements() {
		return "Announcements Page";
	}
	
	@RequestMapping(value = "/attendance", method = RequestMethod.PUT)
	public String attendance() {
		return "Attendance Page";
	}
	
	@RequestMapping(value = "/scorecard", method = RequestMethod.GET)
	public String scorecard() {
		return "Test Performance";
	}
	
	@RequestMapping(value = "/classroom", method = RequestMethod.POST)
	public String classroom() {
		return "Hybd 227";
	}
	
	@RequestMapping(value = "feedback", method = RequestMethod.GET)
	public String feedback() {
		return "Mock Feedbacks";
	}
	
	
}
