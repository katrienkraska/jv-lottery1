package org.example;

import org.example.Ball;
import org.example.Lottery;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();


        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}