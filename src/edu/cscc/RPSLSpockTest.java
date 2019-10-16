package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPSLSpockTest {

    @Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
        Assert.assertFalse("wrong", false);
    }

    @Test
    public void generatePick() {
        for (int i = 0; i < 1000000; i++) {
            String test = RPSLSpock.generatePick();
            Assert.assertNotNull(test);
            Assert.assertTrue(RPSLSpock.isValidPick(test));
        }
    }

    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.ROCK));
        
    }
}