package com.ca.drawing;

import java.awt.Canvas;
import java.awt.Point;
/** class that represent circle */
public class Circle extends Shape {
	/** the center of the circle */
	private Point center;
	/** the diameter of the circle */
	private Double diameter;

	/** Creates a new circle */
	public Circle(final Point center,final Double diameter) {
		super();
		setCenter(center);
		setDiameter(diameter);
	}

	/**  @return center */
	public Point getCenter() {
		return center;
	}
 
	/**  @return diameter */
	public Double getDiameter() {
		return diameter;
	}

	private void setCenter(final Point center) {
		this.center = center;
	}

	private void setDiameter(final Double diameter) {
		this.diameter = diameter;
	}

	
	/** @return area of the circle */
	@Override
	public Double getArea() {
		return Math.PI * getDiameter() * getDiameter();
	}

	/** draws the circle to the canvas */
	@Override
	public void draw(final Canvas canvas) {
		// // FIXME: not implemented

	}

	/** deletes the circle */
	@Override
	public void delete() {
		// FIXME: not implemented

	}

}
