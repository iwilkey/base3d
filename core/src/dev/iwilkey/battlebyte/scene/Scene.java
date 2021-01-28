package dev.iwilkey.battlebyte.scene;

import java.util.ArrayList;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g3d.ModelBatch;

import dev.iwilkey.battlebyte.ui.UIObject;

public abstract class Scene {
	
	public static Scene currentScene;
	
	public InputAdapter input;
	public ArrayList<UIObject> uiObjects;
	
	public Scene() { uiObjects = new ArrayList<>(); }
	
	public abstract void create();
	public abstract void tick();
	public abstract void render(ModelBatch b);
	public abstract void renderGUI(Batch b);
	public abstract void dispose();
}
