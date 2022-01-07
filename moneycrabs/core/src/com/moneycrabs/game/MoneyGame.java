package com.moneycrabs.game;

import com.badlogic.gdx.Game;
import com.moneycrabs.game.MoneyCrabs;
import com.moneycrabs.game.MoneyMenu;

public class MoneyGame extends Game
{
    public void create()
    {
        com.moneycrabs.game.MoneyMenu cm = new MoneyMenu(this);
        setScreen( cm );

    }
}
