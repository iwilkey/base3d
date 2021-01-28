package dev.iwilkey.battlebyte.scene;

import dev.iwilkey.battlebyte.input.MenuInputHandler;

public abstract class MenuScene extends Scene {

	public MenuScene() {
		super();
		input = new MenuInputHandler();
		create();
	}
	
}
