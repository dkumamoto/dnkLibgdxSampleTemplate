package com.dnk.libgdx.sample.renderers;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dnk.libgdx.sample.asset_manager.Asset_Manager;
import com.dnk.libgdx.sample.worlds.Main_World;

public class Main_Renderer {
	private Main_World myWorld;

	private OrthographicCamera camera;
	private SpriteBatch batch;

	public Main_Renderer (Main_World paramWorld) {
		myWorld = paramWorld;
		camera = new OrthographicCamera(Asset_Manager.width, Asset_Manager.height);
		camera.setToOrtho(true, Asset_Manager.width, Asset_Manager.height);
		batch = new SpriteBatch();
		batch.setProjectionMatrix(camera.combined);
	}

	public void render() {
		camera.update();
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(1, 0, 1, 0);
		batch.begin();
		if (myWorld.isScreenLocked()) {
			batch.draw(Asset_Manager.Screen_Info, 0, 0, Asset_Manager.width, Asset_Manager.height);
		}
		else {
			int buttonTop = Asset_Manager.height - Asset_Manager.buttonHeight;
			batch.draw(Asset_Manager.Button_Exit, 0, buttonTop, Asset_Manager.buttonWidth, Asset_Manager.buttonHeight);
			batch.draw(Asset_Manager.Button_Play, Asset_Manager.width/2-Asset_Manager.buttonWidth/2, buttonTop, Asset_Manager.buttonWidth, Asset_Manager.buttonHeight);
			batch.draw(Asset_Manager.Button_Info, Asset_Manager.width-Asset_Manager.buttonWidth, buttonTop, Asset_Manager.buttonWidth, Asset_Manager.buttonHeight);
		}
		batch.end();
	}
}
