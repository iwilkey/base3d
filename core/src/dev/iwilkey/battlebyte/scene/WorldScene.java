package dev.iwilkey.battlebyte.scene;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;

import dev.iwilkey.battlebyte.Settings;
import dev.iwilkey.battlebyte.gfx.Camera;
import dev.iwilkey.battlebyte.gfx.object.GameObject;
import dev.iwilkey.battlebyte.input.GameInputHandler;
import dev.iwilkey.battlebyte.ui.UIObject;

public abstract class WorldScene extends Scene {
	
	public Camera camera;
	public Environment environment;
	public ArrayList<GameObject> gameObjects;
	
	public WorldScene() {
		super();
		camera = new Camera(Settings.CAMERA_FOV, 
				Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		environment = new Environment();
		gameObjects = new ArrayList<>();
		input = new GameInputHandler(camera);
		create();
	}
	
	@Override
	public void tick() {
		((GameInputHandler)input).update();
		for(GameObject o : gameObjects) o.tick();
	}
	
	@Override
	public void render(ModelBatch b) {
		for(GameObject o : gameObjects) o.render(b, environment);
	}
	
	@Override
	public void renderGUI(Batch b) {
		for(UIObject o : uiObjects) o.render(b);
	}
	
	@Override
	public void dispose() {
		for(GameObject o : gameObjects) o.dispose();
	}

}
