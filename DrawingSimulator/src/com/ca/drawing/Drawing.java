package com.ca.drawing;

import java.awt.Color;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/** Class representing complex drawings */
public class Drawing extends Drawable {
	/** subdrawings of this drawing */
	final private List<Drawable> subDrawings;

	/** an empty drawing */
	public Drawing() {
		super();
		subDrawings = new LinkedList<>();
	}

	/** @return the number of colours used */
	public Integer getColorCount() {
		return getUsedColors().size();
	}

	/** @return the colours that are used in this drawing */
	@Override
	public Set<Color> getUsedColors() {
		final Set<Color> colorsUsed = new HashSet<>();
		for (final Drawable subDrawing : subDrawings) {
			colorsUsed.addAll(subDrawing.getUsedColors());
		}
		colorsUsed.remove(null);
		return colorsUsed;
	}

	/** Calculates the total area assuming no subdrawings collide */
	@Override
	public Double getArea() {
		Double result = .0;
		for (final Drawable subDrawing : subDrawings) {
			result += subDrawing.getArea();
		}
		return result;
	}

	/** @return string representation of the leaves of the shape tree */
	public String getShapesList() {
		final StringBuilder result = new StringBuilder();
		for (final Drawable drawable : subDrawings) {
			result.append(',');
			if (drawable instanceof Drawing) {
				result.append(((Drawing) drawable).getShapesList());
			} else {
				result.append(getShapeName(drawable.getClass()));
			}
		}
		if (result.length() == 1) {
			result.deleteCharAt(0);
		}
		return result.toString();
	}

	/** deletes this drawing and all its subdrawings */
	@Override
	public void delete() {
		for (final Drawable subDrawing : subDrawings) {
			subDrawing.delete();
		}
		subDrawings.removeAll(subDrawings);
	}

	/** adds a drawable to this drawing */
	public void add(final Drawable drawable) {
		subDrawings.add(drawable);
	}

	private String getShapeName(final Class<?> klass) {
		return klass.getSimpleName();
	}
}
