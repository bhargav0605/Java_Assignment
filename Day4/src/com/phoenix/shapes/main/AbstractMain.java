/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangles;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference of super class
		Shape ref;
		
		//object of circle class using ref of super class
		System.out.println("***Circle***");
		ref = new Circle(3.0f);
		ref.calculatedArea();
		ref.calculatePerimeter();
		
		//object of rectangle class using ref of super class
		System.out.println("***Rectangle***");
		ref = new Rectangles(4, 8);
		ref.calculatedArea();
		ref.calculatePerimeter();
		
		//Object of Square
		System.out.println("***Square***");
		ref = new Square(20);
		ref.calculatedArea();
		ref.calculatePerimeter();
	}
} //end of class
