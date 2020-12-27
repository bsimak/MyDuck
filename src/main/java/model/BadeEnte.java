package model;

import behavior.FlyNoWay;
import behavior.MuteQuack;


public class BadeEnte extends Duck {

    public BadeEnte() {
        display();
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    public void display() {
        System.out.println("Ich bin eine gelbe Quitsche-Ente");
    }
}
