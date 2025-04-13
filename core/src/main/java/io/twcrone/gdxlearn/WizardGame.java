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
        this.wizard = new Wizard();
        wizard.setTexture(new Texture( Gdx.files.internal("assets/wizard.png")));
        wizard.setPosition(20, 20);
        mainStage.addActor(wizard);

        dragon = new ActorBase();
        dragon.setTexture(new Texture( Gdx.files.internal("assets/dragon.png")));
        dragon.setPosition(380, 380);
        mainStage.addActor(dragon);
        win = false;
    }
}
