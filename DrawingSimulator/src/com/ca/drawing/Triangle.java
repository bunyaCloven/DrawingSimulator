package com.ca.drawing;

import java.awt.Canvas;
import java.awt.Point;

/** class that represent Triangle */
public class Triangle extends Shape {
    /** first point of the triangle */
	private Point point0;
	/** second point of triangle  */
	private Point point1;
	/** third point of the triangle */
	private Point point2;

	/** Creates a new triangle */ 
	public Triangle(final Point point0, final Point point1, final Point point2) {
		super();
		setPoint0(point0);
		setPoint1(point1);
		setPoint2(point2);
	}

	private Point getPoint0() {
		return point0;
	}

	private void setPoint0(final Point point0) {
		this.point0 = point0;
	}

	private Point getPoint1() {
		return point1;
	}

	private void setPoint1(final Point point1) {
		this.point1 = point1;
	}

	private Point getPoint2() {
		return point2;
	}

	private void setPoint2(final Point point2) {
		this.point2 = point2;
	}

	
	/** @return area of the triangle*/
	@Override
	public Double getArea() {
		final Double edge0 = calculateDistance(getPoint0(), getPoint1());
		final Double edge1 = calculateDistance(getPoint1(), getPoint2());
		final Double edge2 = calculateDistance(getPoint0(), getPoint2());
		return (1.0 / 4) * Math.sqrt(
				(edge0 + edge1 + edge2) * (-edge0 + edge1 + edge2) * (edge0 - edge1 + edge2) * (edge0 + edge1 - edge2));
	}
	
	/** draws the triangle to the canvas */
	@Override
	public void draw(final Canvas canvas) {
		  // FIXME: not implemented

	}

	/** deletes the triangle */
	@Override
	public void delete() {
		  // FIXME: not implemented

	}

}
