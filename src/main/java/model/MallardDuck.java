package model;

import behavior.FlyWithWings;
import behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        display();
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm the Mallard Guy");
    }
}
