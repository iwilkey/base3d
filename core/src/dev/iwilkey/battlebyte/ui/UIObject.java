package dev.iwilkey.battlebyte.ui;

import com.badlogic.gdx.graphics.g2d.Batch;

// UI base class.
public abstract class UIObject {
	
	public int x, y;
	
	public void setX(float x) { this.x = (int)x; }
	public void setY(float y) { this.y = (int)y; }
	public void addX(float dx) { this.x += dx; }
	public void addY(float dy) { this.y += dy; }
	
	public abstract void centerScreenX();
	public abstract void centerScreenY();
	public abstract void tick();
	public abstract void render(Batch b);
	
}
