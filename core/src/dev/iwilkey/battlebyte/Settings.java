package dev.iwilkey.battlebyte;

public class Settings {
	
	// UI
	public static float UI_SCALE;
	public static int DEFAULT_FONT_SIZE;
	
	// GFX
	public static int CAMERA_FOV;
	
	public static void init() {
		// UI
		UI_SCALE = 1.0f;
		DEFAULT_FONT_SIZE = (int)(22 * UI_SCALE);
		
		// GFX
		CAMERA_FOV = 67;
	}

}
