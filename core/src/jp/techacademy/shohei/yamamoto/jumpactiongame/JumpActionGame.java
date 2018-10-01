package jp.techacademy.shohei.yamamoto.jumpactiongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpActionGame extends Game {
	// publicにして外からアクセスできるようにする
	public SpriteBatch batch;
	public ActivityRequestHandler mReauestHandler;

	public JumpActionGame(ActivityRequestHandler requestHandler){
		super();
		mReauestHandler = requestHandler;
	}

	@Override
	public void create () {
		batch = new SpriteBatch();

		// GameScreenを表示する
		setScreen(new GameScreen(this));
	}
}
