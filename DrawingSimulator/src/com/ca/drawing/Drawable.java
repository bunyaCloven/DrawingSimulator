package com.ca.drawing;

import java.awt.Color;
import java.util.Set;

@SuppressWarnings("PMD.AbstractNaming")
/** base class for drawable objects */
public abstract class Drawable {
	/** abstract; does nothing */
	protected Drawable() {
		// empty, because abstract
	}

	/** @return the used colors */
	public abstract Set<Color> getUsedColors();

	/** @return area */
	public abstract Double getArea();

	/** deletes the drawable */
	public abstract void delete();
}
