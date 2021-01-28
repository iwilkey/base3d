package dev.iwilkey.battlebyte.scene.specific;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.math.MathUtils;

import dev.iwilkey.battlebyte.Settings;
import dev.iwilkey.battlebyte.clock.Clock;
import dev.iwilkey.battlebyte.gfx.object.Cube;
import dev.iwilkey.battlebyte.scene.WorldScene;
import dev.iwilkey.battlebyte.ui.Text;

public class DebugWorldScene extends WorldScene {
	
	@Override
	public void create() {
		camera.position.set(10f, 10f, 10f);
		camera.lookAt(0,0,0);
		camera.near = 1f;
		camera.far = 300f;
		camera.update();
		
		environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.2f, 0.2f, 0.2f, 1.0f)); // Set the lighting color to white
		environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, -1f, -0.8f, -0.2f));
		
		for(int i = 0; i < 400; i++)
			gameObjects.add(new Cube(1, 1, 1, MathUtils.random(-10, 10), MathUtils.random(-10, 10), 
					MathUtils.random(-10, 10), new Color(MathUtils.random(0, 255) / 255f, 
					MathUtils.random(0, 255) / 255f, MathUtils.random(0, 255) / 255f, 1.0f)));
		
		uiObjects.add(new Text("Andrew, stop being a baby back bitch", 10 * Settings.UI_SCALE, 28 * Settings.UI_SCALE));
		final Text fpsText = new Text("");
		fpsText.centerScreenX();
		fpsText.setY(28 * Settings.UI_SCALE);
		new Thread() {
			public void run() {
				while(true) {
					fpsText.message = "FPS: " + Clock.SYSTEM_FPS;
					fpsText.centerScreenX();
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		uiObjects.add(fpsText);
		
	}
	
	@Override
	public void tick() {
		super.tick();
	}

	@Override
	public void render(ModelBatch b) {
		super.render(b);
	}

	@Override
	public void renderGUI(Batch b) {
		super.renderGUI(b);
	}
	
}
