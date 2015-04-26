package com.dnk.libgdx.sample.template.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dnk.libgdx.sample.main.dnkLibgdxSampleTemplate;
import com.dnk.libgdx.sample.asset_manager.Asset_Manager;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = Asset_Manager.width;
		config.height = Asset_Manager.height;
		new LwjglApplication(new dnkLibgdxSampleTemplate(), config);
	}
}
