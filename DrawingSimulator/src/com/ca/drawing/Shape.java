package com.ca.drawing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public abstract class Shape extends Drawable {
	private Color color;

	public abstract void draw(Canvas canvas);

	public void fillColor(Color color) {
		setColor(color);
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	protected Double calculateDistance(Point p0, Point p1) {
		return Point.distance(p0.getX(), p0.getY(), p1.getX(), p1.getY());
	}

	@Override
	public Set<Color> getUsedColors() {
		Set<Color> colors = new HashSet<>();
		colors.add(color);
		return colors;
	}
}
