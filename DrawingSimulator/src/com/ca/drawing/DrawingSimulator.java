package com.ca.drawing;

import java.awt.Color;
import java.awt.Point;

/** application class for simulating behavior */
public final class DrawingSimulator {
	private DrawingSimulator() {
	}

	@SuppressWarnings("PMD.SystemPrintln")
	/** the main method to simulate behavior */
	public static void main(final String... args) {
		final Drawing root = new Drawing();
		final Drawing sub0 = new Drawing();
		final Drawing sub1 = new Drawing();
		final Drawing roof = new Drawing();
		final Triangle tri0 = new Triangle(new Point(0, 0), new Point(0, 3),
				new Point(4, 0));
		final Triangle tri1 = new Triangle(new Point(0, 0), new Point(0, 5),
				new Point(12, 0));
		final Triangle tri2 = new Triangle(new Point(0, 0), new Point(0, 7),
				new Point(24, 0));
		final Triangle tri3 = new Triangle(new Point(0, 1), new Point(0, 7),
				new Point(15, 0));
		final Rectangle rect0 = new Rectangle(new Point(0, 0), 10., 5.);
		final Rectangle rect1 = new Rectangle(new Point(0, 0), 7., 19.);
		final Rectangle rect2 = new Rectangle(new Point(0, 0), .7, .96);
		final Circle circ = new Circle(new Point(0, 0), 3.);
		tri0.fillColor(Color.black);
		tri1.fillColor(Color.black);
		tri2.fillColor(Color.blue);
		tri3.fillColor(Color.cyan);
		rect0.fillColor(Color.red);
		rect1.fillColor(Color.cyan);
		rect2.fillColor(Color.yellow);
		circ.fillColor(Color.magenta);
		roof.add(tri0);
		roof.add(tri1);
		roof.add(tri2);
		sub0.add(rect0);
		sub0.add(roof);
		sub0.add(circ);
		sub1.add(rect1);
		sub1.add(rect2);
		root.add(sub0);
		root.add(sub1);
		root.add(tri3);
		System.out.println(root.getColorCount());
		System.out.println(root.getArea());
		System.out.println(root.getShapesList());
		root.delete();
		System.out.println(root.getColorCount());
		System.out.println(root.getArea());
	}
}
