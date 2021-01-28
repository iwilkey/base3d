package dev.iwilkey.battlebyte.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;

public class MenuInputHandler extends InputAdapter {
	
	public MenuInputHandler() {
		Gdx.input.setInputProcessor(this);
	}
	
}
