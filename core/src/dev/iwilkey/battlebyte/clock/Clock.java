package dev.iwilkey.battlebyte.clock;

import com.badlogic.gdx.Gdx;

import dev.iwilkey.battlebyte.scene.Scene;

public class Clock {
	
	public static float GDX_FPS, SYSTEM_FPS;
	
	public long now = System.nanoTime(),
		last = 0,
		delta,
		frames;
	
	public void tick() {
		
		GDX_FPS = 1 / Gdx.graphics.getDeltaTime();
		
		last = now;
		now = System.nanoTime();
		delta += (now - last);
		frames++;
		if(delta > 1000000000) {
			SYSTEM_FPS = frames;
			frames = 0;
			delta = 0;
		}
		
		Scene.currentScene.tick();
		
	}

}
