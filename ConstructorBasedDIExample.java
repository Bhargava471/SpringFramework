package com.mouritech.springdiexample.constructordi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.Shape;

@Component
public class ConstructorBasedDIExample {
	private Shape selectShape;

	@Autowired
	public ConstructorBasedDIExample(@Qualifier("SquareService") Shape sShape) {
		super();
		this.selectShape= sShape;
	}
	
	
	public Shape getSelectShape() {
		return selectShape;
	}


	public void setSelectShape(Shape selectShape) {
		this.selectShape = selectShape;
	}


	public void selectShape(String shape) {
		selectShape.selectShape(shape);
	}
}