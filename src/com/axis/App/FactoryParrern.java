package com.axis.App;

import com.axis.Factory.ShapeFactory;
import com.axis.Models.Shape;

public class FactoryParrern {
	public static void main(String[] args)
	{
		System.out.println("Factory Pattern");
		ShapeFactory  shapeFactory=new ShapeFactory();
		Shape shape=shapeFactory.getShape("Circle");
		shape.draw();
	}

}
