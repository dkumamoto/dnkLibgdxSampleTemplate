package com.dnk.libgdx.sample.main;

import com.badlogic.gdx.Game;
import com.dnk.libgdx.sample.asset_manager.Asset_Manager;
import com.dnk.libgdx.sample.screens.Main_Screen;

public class dnkLibgdxSampleTemplate extends Game {

	@Override
	public void create() {
		Asset_Manager.load();
		while (!Asset_Manager.manager.update())
			;
		Asset_Manager.create();
		setScreen(new Main_Screen());		
	}

	@Override
	public void dispose () {
		
	}
}
