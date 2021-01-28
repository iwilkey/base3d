package dev.iwilkey.battlebyte.gfx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.ModelBatch;

import dev.iwilkey.battlebyte.scene.Scene;
import dev.iwilkey.battlebyte.scene.WorldScene;

public class Renderer {
	
	public static int DEFAULT_WIDTH, DEFAULT_HEIGHT;
	
	final ModelBatch MODEL_BATCH;
	final SpriteBatch GUI_BATCH;
	
	public Renderer() {
		DEFAULT_WIDTH = Gdx.graphics.getWidth();
		DEFAULT_HEIGHT = Gdx.graphics.getHeight();
		MODEL_BATCH = new ModelBatch();
		GUI_BATCH = new SpriteBatch();
	}
	
	public void render() {
		
		Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		
		if(Scene.currentScene instanceof WorldScene) {
			MODEL_BATCH.begin(((WorldScene)(Scene.currentScene)).camera);
			Scene.currentScene.render(MODEL_BATCH);
			MODEL_BATCH.end();
		}
	
		GUI_BATCH.begin();
		Scene.currentScene.renderGUI(GUI_BATCH);
		GUI_BATCH.end();
		
	}
	
	public void dispose() {
		MODEL_BATCH.dispose();
		GUI_BATCH.dispose();
	}

}
