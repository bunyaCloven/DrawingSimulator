package com.ca.drawing;

import java.awt.Canvas;
import java.awt.Point;

/** Class that represents rectangles */
public class Rectangle extends Shape {
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

	/** @return area of the rectangle */
	@Override
	public Double getArea() {
		return length * height;
	}

	/** draws the rectangle to canvas */
	@Override
	public void draw(final Canvas canvas) {
		// FIXME: not implemented

	}

	/** deletes this rectangle */
	@Override
	public void delete() {
		// FIXME: not implemented

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
