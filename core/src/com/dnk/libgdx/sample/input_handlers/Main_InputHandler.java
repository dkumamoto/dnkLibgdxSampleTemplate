package com.dnk.libgdx.sample.input_handlers;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.dnk.libgdx.sample.asset_manager.Asset_Manager;
import com.dnk.libgdx.sample.renderers.Main_Renderer;
import com.dnk.libgdx.sample.screens.Play_Screen;
import com.dnk.libgdx.sample.worlds.Main_World;

public class Main_InputHandler implements InputProcessor {
	private Main_Renderer myRender;
	private Main_World myWorld;
	
	public Main_InputHandler(Main_World paramWorld, Main_Renderer paramRender) {
		myRender = paramRender;
		myWorld = paramWorld;
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		System.out.println("Touched!");
		int height = Gdx.graphics.getHeight();
		int width = Gdx.graphics.getWidth();
		double heightRatio = (double)height / Asset_Manager.height;
		double widthRatio = (double) width / Asset_Manager.width;
		int buttonTop = Asset_Manager.height - Asset_Manager.buttonHeight;
		if (myWorld.isScreenLocked()) {
			myWorld.toggleScreenLock();
		}
		else {
			if (screenY > buttonTop * heightRatio) {
				if (screenX > 0 && screenX <= Asset_Manager.buttonWidth * widthRatio) {
					// exit button found
					System.out.println("Exit button");
					Gdx.app.exit();
				}
				int middleStart = Asset_Manager.width/2-Asset_Manager.buttonWidth/2;
				if (screenX > middleStart * widthRatio && screenX <= (middleStart+Asset_Manager.buttonWidth) * widthRatio) {
					((Game) Gdx.app.getApplicationListener()).setScreen(new Play_Screen());
					// 
				}
				if (screenX > (Asset_Manager.width - Asset_Manager.buttonWidth) * widthRatio && screenX <= (Asset_Manager.width) * widthRatio) {
					myWorld.toggleScreenLock();
				}
			}
		}
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}


}
