package io.twcrone.gdxlearn;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Wizard extends ActorBase{
    public Wizard(float x, float y) {
        super(x, y);
        loadAnimationFromSheet("assets/wizard/Idle.png", 1, 6, 0.1f, true);
    }

    public void act(float dt) {
        super.act(dt);
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            this.moveBy(-1, 0);
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            this.moveBy(1, 0);
        if (Gdx.input.isKeyPressed(Input.Keys.UP))
            this.moveBy(0, 1);
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
            this.moveBy(0, -1);
    }
}
