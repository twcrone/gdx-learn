package io.twcrone.gdxlearn;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class WizardGame extends Game {

    private Stage mainStage;
    private Wizard wizard;
    private ActorBase dragon;
    private boolean win;

    @Override
    public void create() {
        mainStage = new Stage();
        this.wizard = new Wizard();
        wizard.setTexture(new Texture( Gdx.files.internal("assets/wizard.png")));
        wizard.setPosition(20, 20);
        mainStage.addActor(wizard);

        dragon = new ActorBase();
        dragon.setTexture(new Texture( Gdx.files.internal("assets/dragon.png")));
        dragon.setPosition(380, 380);
        mainStage.addActor(dragon);
        //oceanTexture = new Texture( Gdx.files.internal("assets/water.jpg") );
        //winMessageTexture = new Texture( Gdx.files.internal("assets/you-win.png") );
        win = false;
    }

    @Override
    public void render()
    {
        // check user input
        mainStage.act(1/60f);
        // check win condition: turtle must be overlapping starfish
        if (wizard.overlaps(dragon))
        {
            dragon.remove();
  //          winMessage.setVisible(true);
        }
        // clear screen
        Gdx.gl.glClearColor(0,0,0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        // draw graphics
        mainStage.draw();
    }
}
