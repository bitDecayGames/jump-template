package com.bitdecay.game;

import com.badlogic.gdx.Game;
import com.bitdecay.game.screen.GameScreen;
import com.bitdecay.game.util.RunMode;
import com.bitdecay.jump.leveleditor.render.LevelEditor;

public class EditorApp extends Game {

    @Override
    public void create() {
        // Change to our room screen
        MyGame game = new MyGame(RunMode.DEV);
        game.create();
        GameScreen screen = new GameScreen(game);
        setScreen(new LevelEditor(screen));
    }

}