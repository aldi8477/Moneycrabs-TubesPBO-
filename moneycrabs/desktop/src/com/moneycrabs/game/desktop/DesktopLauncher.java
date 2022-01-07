package com.moneycrabs.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.moneycrabs.game.MoneyCrabs;
import com.moneycrabs.game.MoneyGame;

public class DesktopLauncher {

	public static void main (String[] arg) {
		MoneyGame myProgram = new MoneyGame();
		LwjglApplication launcher = new LwjglApplication(
				myProgram );
	}
}
