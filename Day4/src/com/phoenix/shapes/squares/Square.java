/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape   {
	
	private int side;
	
	public Square() {
		super();
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void calculatedArea() {
		// TODO Auto-generated method stub
		double area = 0;
		area = side * side;
		System.out.println();
		System.out.println("Using Calculated Area Method: ");
		System.out.println("Area of Square is: " + area);
		System.out.println();
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 0;
		perimeter = 4 * side;
		System.out.println();
		System.out.println("Using Calculated Perimeter Method: ");
		System.out.println("Perimeter of Square is: " + perimeter);	
		System.out.println();
	}
} //end of class
