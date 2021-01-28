package dev.iwilkey.battlebyte.gfx.object;

import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;

public abstract class GameObject {
	
	Model model;
	ModelInstance instance;
	
	public abstract void tick();
	public abstract void render(ModelBatch b, Environment e);
	public void dispose() { model.dispose(); }
	
}
