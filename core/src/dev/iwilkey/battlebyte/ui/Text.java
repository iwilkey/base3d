package dev.iwilkey.battlebyte.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

import dev.iwilkey.battlebyte.Settings;
import dev.iwilkey.battlebyte.gfx.Renderer;

public class Text extends UIObject {
	
	BitmapFont font;
	Color color;
	
	public String message;

	// Construction
	public Text() {
		font = new BitmapFont(Gdx.files.internal("data/font.fnt"), false);
		font.getData().setScale((Settings.DEFAULT_FONT_SIZE) / 128.0f);
	}
	
	public Text(String message) {
		font = new BitmapFont(Gdx.files.internal("data/font.fnt"), false);
		font.getData().setScale((Settings.DEFAULT_FONT_SIZE) / 128.0f);
		this.message = message;
	}
	
	public Text(String message, float x, float y) {
		font = new BitmapFont(Gdx.files.internal("data/font.fnt"), false);
		font.getData().setScale((Settings.DEFAULT_FONT_SIZE) / 128.0f);
		this.message = message;
		setX(x); setY(y);
	}
	
	// Physical attributes
	public void setColor(Color color) {
		font.setColor(color);
	}
	
	public void setSize(int size) {
		font.getData().setScale((size * Settings.UI_SCALE) / 128.0f);
	}
	
	public void centerScreenX() {
		GlyphLayout layout = new GlyphLayout(font, message);
		int textWidth = (int)layout.width;
		setX((Renderer.DEFAULT_WIDTH / 2) - (textWidth / 2));
	}
	
	public void centerScreenY() {
		GlyphLayout layout = new GlyphLayout(font, message);
		int textHeight = (int)layout.height;
		setY((Renderer.DEFAULT_HEIGHT / 2) + (textHeight / 2));
	}
	
	public int getLayoutWidth() {
		GlyphLayout layout = new GlyphLayout(font, message);
		return (int)layout.width;
	}
	
	public int getLayoutHeight() {
		GlyphLayout layout = new GlyphLayout(font, message);
		return (int)layout.height;
	}

	@Override
	public void render(Batch b) {
		font.draw(b, message, x, y);
	}

	@Override
	public void tick() {}

}
