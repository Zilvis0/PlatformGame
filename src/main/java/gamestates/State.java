package gamestates;

import main.Game;
import ui.MenuButton;

import java.awt.event.MouseEvent;

public class State {

    protected Game game;

    public State(Game game){
        this.game = game;
    }

    public Game getGame(){
        return game;
    }

    public Boolean isIn(MouseEvent e, MenuButton mb){
        return mb.getBounds().contains(e.getX(), e.getY());
    }
}
