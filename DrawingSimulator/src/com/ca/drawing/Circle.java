package com.ca.drawing;

import java.awt.Canvas;
import java.awt.Point;

public class Circle extends Shape {
	private Point center;
	private Double diameter;

	public Circle(Point center, Double diameter) {
		setCenter(center);
		setDiameter(diameter);
	}

	private void setCenter(Point center) {
		this.center = center;
	}

	private void setDiameter(Double diameter) {
		this.diameter = diameter;
	}

	@Override
	public Double getArea() {
		return Math.PI * diameter * diameter;
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
