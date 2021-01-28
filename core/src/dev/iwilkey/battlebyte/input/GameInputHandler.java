package dev.iwilkey.battlebyte.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;

public class GameInputHandler extends CameraInputController {

	public GameInputHandler(Camera camera) {
		super(camera);
		Gdx.input.setInputProcessor(this);
	}

}
