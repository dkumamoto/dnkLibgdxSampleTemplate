package com.dnk.libgdx.sample.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.dnk.libgdx.sample.input_handlers.Main_InputHandler;
import com.dnk.libgdx.sample.renderers.Main_Renderer;
import com.dnk.libgdx.sample.worlds.Main_World;

public class Main_Screen implements Screen {
	Main_World myWorld;
	Main_Renderer myRender;
	
	public Main_Screen() {
		myWorld = new Main_World();
		myRender = new Main_Renderer(myWorld);
		Gdx.input.setInputProcessor(new Main_InputHandler(myWorld, myRender));
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		myWorld.update();
		myRender.render();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}


}
