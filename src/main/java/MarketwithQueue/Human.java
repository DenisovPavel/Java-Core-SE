package MarketwithQueue;

public class Human extends Actor implements ActorBehaviour {


    public Human(String human ) {
        super(human);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
        System.out.println("The Order is accepted");
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        System.out.println("The order has been issued");
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
