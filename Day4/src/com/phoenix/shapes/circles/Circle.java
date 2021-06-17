/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape{
	
	private float radius;

	public Circle() {
		super();
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void calculatedArea() {
		// TODO Auto-generated method stub
		double area = 0;
		area = MATH_PI * radius * radius;
		System.out.println();
		System.out.println("Using Calculated Area Method: ");
		System.out.println("Area of circle is: " + area);
		System.out.println();
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 0;
		perimeter = 2 * MATH_PI * radius;
		System.out.println();
		System.out.println("Using Calculated Perimeter Method: ");
		System.out.println("Perimeter of circle is: " + perimeter);		
		System.out.println();
	}
} //end of class
