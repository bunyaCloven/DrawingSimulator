package com.ca.drawing;

import java.awt.Color;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Drawing extends Drawable {
	private List<Drawable> subDrawings;

	public Drawing() {
		subDrawings = new LinkedList<>();
	}

	public Integer getColorCount() {
		return getUsedColors().size();
	}

	@Override
	public Set<Color> getUsedColors() {
		Set<Color> colorsUsed = new HashSet<>();
		for (Drawable subDrawing : subDrawings) {
			colorsUsed.addAll(subDrawing.getUsedColors());
		}
		colorsUsed.remove(null);
		return colorsUsed;
	}

	@Override
	/** Calculates the total area assuming no subdrawings collide */
	public Double getArea() {
		Double result = .0;
		for (final Drawable subDrawing : subDrawings) {
			result += subDrawing.getArea();
		}
		return result;
	}

	public String getShapesList() {
		final StringBuilder result = new StringBuilder();
		for (final Drawable drawable : subDrawings) {
			result.append(',');
			if (drawable instanceof Drawing) {
				result.append(((Drawing) drawable).getShapesList());
			} else {
				result.append(drawable.getClass().getSimpleName());
			}
		}
		if (result.length() == 1) {
			result.deleteCharAt(0);
		}
		return result.toString();
	}

	@Override
	public void delete() {
		for (final Drawable subDrawing : subDrawings) {
			subDrawing.delete();
		}
		subDrawings.removeAll(subDrawings);
	}

	public void add(Drawable drawable) {
		subDrawings.add(drawable);
	}
}
