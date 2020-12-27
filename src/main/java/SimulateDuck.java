import behavior.FlyBehavior;
import behavior.FlyNoWay;
import behavior.FlyWithWings;
import behavior.MuteQuack;
import model.BadeEnte;
import model.Duck;
import model.MallardDuck;

public class SimulateDuck {
    public static void main(String[] args) {
       // Entenauftritt
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck entlein = new BadeEnte();

        entlein.setFlyBehavior(new FlyNoWay());
        entlein.setQuackBehavior(new MuteQuack());

        entlein.performFly();

        System.out.println("kein Schwarm - zu wenig Enten");
    }

}
