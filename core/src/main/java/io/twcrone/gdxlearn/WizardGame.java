package io.twcrone.gdxlearn;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class WizardGame extends GameBase {

    private Wizard wizard;
    private ActorBase dragon;
    private boolean win;

    @Override
    public void update(float dt)
    {
        if (wizard.overlaps(dragon))
        {
            dragon.remove();
            wizard.setVisible(true);
            win = true;
        }
    }

    @Override
    public void initialize() {
        this.wizard = new Wizard(100, 100);
        mainStage.addActor(wizard);

        dragon = new ActorBase(380, 380);
        dragon.setTexture(new Texture( Gdx.files.internal("assets/dragon.png")));
        mainStage.addActor(dragon);
        win = false;
    }
}
