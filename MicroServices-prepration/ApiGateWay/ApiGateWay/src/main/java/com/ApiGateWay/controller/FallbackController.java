package com.ApiGateWay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userServiceFallback")
	public String userServiceFallback()
	{
		return "user Service is down at this time";
	}
	@GetMapping("/contacterviceFallback")
	public String contactServiceFallback()
	{
		return "contact Service is down at this time";
	}
}