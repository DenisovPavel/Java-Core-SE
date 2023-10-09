package MarketwithQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Human> humanInMarket;
    Queue<Human> humanInQueue;

    public Market() {
        humanInMarket = new ArrayList<>();
        humanInQueue = new LinkedList<>();
    }

    @Override
    public void takeQueue(Human human) {
        humanInQueue.add(human);
        System.out.println(human.getName() + "  standed to the Queue!");
    }

    @Override
    public void takeOrders() {
        for (Human human : humanInQueue) {

            if (!human.isTakeOrder()) {
                human.setTakeOrder();
            }
            System.out.println(human.getName() + "  took order!");
        }
    }

    @Override
    public void giveOrders() {
        for (Human human : humanInQueue) {

            if (human.isMakeOrder()) {
                human.setMakeOrder();
            }
            System.out.println(human.getName() + "  got order!");
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Human> releaseHumans = new ArrayList<>();
        for (Human human : humanInQueue) {
            if (human.isTakeOrder) {
                releaseHumans.add(human);
                System.out.println(human.getName() + "  left Queue!");
            }
        }
        releaseFromMarket(releaseHumans);
    }

    @Override
    public void acceptToMarket(Human human) {
        humanInMarket.add(human);
        System.out.println(human.getName() + "  came inside to Market!");
        takeQueue(human);
    }

    @Override
    public void releaseFromMarket(List<Human> humans) {
        for (Human human : humans) {
            humanInQueue.remove(human);
            System.out.println(human.getName() + "  left Market!");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}


