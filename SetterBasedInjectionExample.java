package com.mouritech.springdiexample.setterid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.Shape;

@Component
public class SetterBasedInjectionExample {
	
	private Shape selectShape;
	
	public Shape getSelectShape() {
		return selectShape;
	}
	
	@Autowired
	@Qualifier("rectangle")
	public void setSelectShape(Shape selectShape) {
		this.selectShape = selectShape;
	}

	public SetterBasedInjectionExample(Shape selectShape) {
		super();
		this.selectShape = selectShape;
	}

	public SetterBasedInjectionExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void selectShape(String shape) {
		selectShape.selectShape(shape);
	}

	
	

}