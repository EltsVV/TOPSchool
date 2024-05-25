package org.RPS.game.gameoptions;

import org.RPS.player.CyborgPlayer;
import org.RPS.player.HumanPlayer;
import org.RPS.player.PCPlayer;
import org.RPS.player.Player;

import java.util.ArrayList;
import java.util.List;

public class PCvsCyborg implements PlayersOptions {
    @Override
    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        players.add(new CyborgPlayer("Cyborg"));
        players.add(new PCPlayer("PC"));
        return players;
    }
}
