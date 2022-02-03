package com.mouritech.springdiexample.fieldbaseddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.mouritech.springdiexample.service.Shape;

@Component
public class FieldBasedInjection {
	@Autowired
	@Qualifier("RectangleService")
	private Shape selectShape;
	
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