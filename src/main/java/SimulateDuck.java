public class SimulateDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("nur eine Ente - kein Schwarm");
    }

}
