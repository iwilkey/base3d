package dev.iwilkey.battlebyte.ui;

import java.awt.Rectangle;

// Any UI that can be interacted with in some way.
public abstract class Interactable extends UIObject {
	
	public Rectangle collider,
		cursor;
	
	public Interactable(int x, int y, int width, int height) {
		collider = new Rectangle(x, y, width, height);
		cursor = new Rectangle(0, 0, 1, 1);
	}
	
	// Location
	public void setX(int x) { 
		super.setX(x);
		collider.x = x; 
	}
	public void setY(int y) {
		super.setY(y);
		collider.y = y; 
	}
	
	public void addX(int dx) { 
		super.addX(dx);
		collider.x += dx; 
	}
	public void addY(int dy) { 
		super.addY(dy);
		collider.y += dy;
	}
	
	// Dimensions
	public void setWidth(int width) { collider.width = width; }
	public void setHeight(int height) { collider.height = height; }
	
	public void addWidth(int dWidth) { collider.width += dWidth; }
	public void addHeight(int dHeight) { collider.height += dHeight; }
	
	// Interaction
	public boolean isHovering(int x, int y) { 
		cursor.x = x; cursor.y = y;
		return collider.intersects(cursor);
	}
	
}
