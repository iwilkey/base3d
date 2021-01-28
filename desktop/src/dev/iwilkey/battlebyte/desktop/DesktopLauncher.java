package dev.iwilkey.battlebyte.desktop;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import dev.iwilkey.battlebyte.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Battlebyte [DEBUG]";
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		config.width = dimension.width - 120; config.height = dimension.height - 120;
		new LwjglApplication(new Game(), config);
	}
}
