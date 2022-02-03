package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;
@Service("CircleService")
public class Circle implements Shape{

	public void selectShape(String shape) {
		// TODO Auto-generated method stub
		System.out.println("...........this is a Circle");
	}

}
