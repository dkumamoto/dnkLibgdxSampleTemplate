package com.dnk.libgdx.sample.asset_manager;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Asset_Manager {
	public static final AssetManager manager = new AssetManager();
	public static final String copyright = "Copyright 2015, Danny Kumamoto, Apache V2.0 license; Soli Deo Gloria";
	public static final int height = 640;
	public static final int width = 960;
	public static final int buttonWidth = 137;
	public static final int buttonHeight = 68;
	public static final String button_exit = "buttons/Exit.png";
	public static final String button_info = "buttons/Info.png";
	public static final String button_play = "buttons/Play.png";
	public static final String screen_info = "screens/ScreenInfo.png";
	//////////////////////////////////////////////////////////////
	
	
	private static Texture Button_exit, Button_info, Button_play, Screen_info;
	////////////////////////////

	public static TextureRegion Button_Exit, Button_Info, Button_Play, Screen_Info;
	
	
	public static void load() {
		manager.load(button_exit, Texture.class);
		manager.load(button_info, Texture.class);
		manager.load(button_play, Texture.class);
		manager.load(screen_info, Texture.class);
	}

	public static void create() {
		Button_exit = manager.get(button_exit, Texture.class);
		Button_Exit = new TextureRegion(Button_exit, 0, 0, buttonWidth, buttonHeight);
		Button_Exit.flip(false, true);

		Button_info = manager.get(button_info, Texture.class);
		Button_Info = new TextureRegion(Button_info, 0, 0, buttonWidth, buttonHeight);
		Button_Info.flip(false, true);
		
		Button_play = manager.get(button_play, Texture.class);
		Button_Play = new TextureRegion(Button_play, 0, 0, buttonWidth, buttonHeight);
		Button_Play.flip(false, true);

		Screen_info = manager.get(screen_info, Texture.class);
		Screen_Info = new TextureRegion(Screen_info, 0, 0, width, height);
		Screen_Info.flip(false, true);
	}

}
