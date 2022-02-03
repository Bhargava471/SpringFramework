package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;
@Service("RectangleService")
public class Rectangle implements Shape{

	public void selectShape(String shape) {
		// TODO Auto-generated method stub
		System.out.println(".........this is Rectangle");
	}
	
}
