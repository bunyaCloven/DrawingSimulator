package com.ca.drawing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

/** Abstract class that represents all renderable shapes */
@SuppressWarnings("PMD.AbstractNaming")
public abstract class Shape extends Drawable {
	/** colour of the shape */
	private Color color;

	/** draws the shape on the canvas */
	public abstract void draw(Canvas canvas);

	/** fills the shape with colour */
	public void fillColor(final Color color) {
		setColor(color);
	}

	private void setColor(final Color color) {
		this.color = color;
	}

	/** @return colour of the shape */
	public Color getColor() {
		return color;
	}

	/** @return distance between two points */
	protected Double calculateDistance(final Point point0, final Point point1) {
		return Point.distance(point0.getX(), point0.getY(), point1.getX(),
				point1.getY());
	}

	/** @return number of used colours */
	@Override
	public Set<Color> getUsedColors() {
		final Set<Color> colors = new HashSet<>();
		colors.add(color);
		return colors;
	}
}
