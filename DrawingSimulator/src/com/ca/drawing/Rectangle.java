package com.ca.drawing;

import java.awt.Canvas;
import java.awt.Point;

public class Rectangle extends Shape {
	@SuppressWarnings("unused")
	/** the top left corner */
	private Point corner0;
	/** the vertical length of the rectangle */
	private Double length;
	/** the horizontal height of the rectangle */
	private Double height;

	/** Creates a new rectangle with point as top left corner */
	public Rectangle(final Point point, final Double length, final Double height) {
		super();
		setCorner0(point);
		setLength(length);
		setHeight(height);
	}

	private void setCorner0(final Point point) {
		this.corner0 = point;
	}

	private void setLength(final Double length) {
		this.length = length;
	}

	private void setHeight(final Double height) {
		this.height = height;
	}

	@Override
	public Double getArea() {
		return length * height;
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	/** @return the top left corner */
	public Point getCorner0() {
		return corner0;
	}

	/** @return length */
	public Double getLength() {
		return length;
	}

	/** @return height */
	public Double getHeight() {
		return height;
	}
}
