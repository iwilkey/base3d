package dev.iwilkey.battlebyte.gfx.object;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;

public class Cube extends GameObject {
	
	public Cube(int length, int width, int height, Color color) {
		ModelBuilder modelBuilder = new ModelBuilder();
		model = modelBuilder.createBox(length, width, height, 
				new Material(ColorAttribute.createDiffuse(color)),
				Usage.Position | Usage.Normal);
		instance = new ModelInstance(model);
	}
	
	public Cube(int length, int width, int height, int x, int y, int z, Color color) {
		ModelBuilder modelBuilder = new ModelBuilder();
		model = modelBuilder.createBox(length, width, height, 
				new Material(ColorAttribute.createDiffuse(color)),
				Usage.Position | Usage.Normal);
		instance = new ModelInstance(model);
		instance.transform.setTranslation(x, y, z);
	}
	
	@Override
	public void tick() {
		
	}
	
	
	public void render(ModelBatch b, Environment e) {
		b.render(instance, e);
	}
	
	public void dispose() {
		
	}
	
}
