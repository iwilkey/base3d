package dev.iwilkey.battlebyte;

import com.badlogic.gdx.ApplicationAdapter;

import dev.iwilkey.battlebyte.clock.Clock;
import dev.iwilkey.battlebyte.gfx.Renderer;
import dev.iwilkey.battlebyte.scene.Scene;
import dev.iwilkey.battlebyte.scene.specific.DebugWorldScene;

public class Game extends ApplicationAdapter {
	
	Clock clock;
	Renderer renderer;
	
	@Override
	public void create () {
		Settings.init();
		clock = new Clock();
		renderer = new Renderer();
		Scene.currentScene = new DebugWorldScene();
	}
	
	private void tick() {
		clock.tick();
	}

	@Override
	public void render () {
		tick();
		renderer.render();
	}
	
	@Override
	public void dispose () {
		renderer.dispose();
		Scene.currentScene.dispose();
		System.gc();
	}
	
}
