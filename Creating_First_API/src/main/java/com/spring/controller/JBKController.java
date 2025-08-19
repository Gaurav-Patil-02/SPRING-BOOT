package com.spring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/jbk")
public class JBKController {

	@GetMapping("/home")
	public String home() {
		return "Home Page";
	}
	
	@PostMapping("/about")
	public String about() {
		return "About The Kiran Academy";
	}
	
	@DeleteMapping("/course")
	public String courses() {
		return "Courses we Offered";
	}
	
	@PutMapping("/upcoming")
	public String upcomingBatches() {
		return "Our Upcoming Batches Schedule";
	}
	
	@PatchMapping("/feedback")
	public String feedback() {
		return "Students Feedback";
	}

}
