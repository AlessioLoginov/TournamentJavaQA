package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GameTest {
    Player playerName1 = new Player(1, "Max", 100);
    Player playerName2 = new Player(2, "Vasya", 150);
    Player playerName3 = new Player(3, "Petya", 500);
    Player playerName4 = new Player(4, "Kolya", 50);
    Player playerName5 = new Player(5, "Nick", 150);
    Player playerName6 = new Player(6, "Andrea", -200);

    Game game = new Game();

    @Test
    public void roundTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName1);
        game.register(playerName2);

        int actual = game.round("Max", "Vasya");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RoundNoWinTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName2);
        game.register(playerName5);

        int actual = game.round("Vasya", "Nick");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void roundWinTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName3);
        game.register(playerName4);

        int actual = game.round("Petya", "Kolya");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }




}