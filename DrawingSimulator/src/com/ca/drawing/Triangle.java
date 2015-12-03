package com.ca.drawing;

import java.awt.Canvas;
import java.awt.Point;

public class Triangle extends Shape {
	private Point point0;
	private Point point1;
	private Point point2;

	public Triangle(Point point0, Point point1, Point point2) {
		setP0(point0);
		setP1(point1);
		setP2(point2);
	}

	private void setP0(Point p0) {
		this.point0 = p0;
	}

	private void setP1(Point p1) {
		this.point1 = p1;
	}

	private void setP2(final Point p2) {
		this.point2 = p2;
	}

	@Override
	public Double getArea() {
		final Double edge0 = calculateDistance(point0, point1);
		final Double edge1 = calculateDistance(point1, point2);
		final Double edge2 = calculateDistance(point0, point2);
		return (1.0 / 4) * Math.sqrt(
				(edge0 + edge1 + edge2) * (-edge0 + edge1 + edge2) * (edge0 - edge1 + edge2) * (edge0 + edge1 - edge2));
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
