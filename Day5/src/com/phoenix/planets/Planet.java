/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable{
	
	private int noOfMoons;
	
	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}

	public int getNoOfMoons() {
		return noOfMoons;
	}
	
	protected abstract boolean supportsLife();

	@Override
	public String toString() {
		return "noOfMoons=" + noOfMoons;
	}
}
