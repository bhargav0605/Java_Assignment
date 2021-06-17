/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangles extends Shape{
	
	private int length;
	private int breadth;

	public Rectangles() {
		super();
	}

	public Rectangles(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calculatedArea() {
		// TODO Auto-generated method stub
		
		double area = 0;
		area = length * breadth;
		System.out.println();
		System.out.println("Using Calculated Area Method: ");
		System.out.println("Area of Rectangle is: " + area);
		System.out.println();
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 0;
		perimeter = 2 * (length * breadth);
		System.out.println();
		System.out.println("Using Calculated Perimeter Method: ");
		System.out.println("Perimeter of Rectangle is: " + perimeter);
		System.out.println();
	}
} //end of class
