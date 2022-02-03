package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;
@Service("SquareService")
public class Square implements Shape{

	public void selectShape(String shape) {
		// TODO Auto-generated method stub
		System.out.println("..........this is Square");
	}
	

}
