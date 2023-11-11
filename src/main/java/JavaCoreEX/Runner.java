package JavaCoreEX;

public interface Runner {

    String getName();

    int getMaxJump();

    int getMaxRun();

    default boolean jump(int height) {
        if (height <= getMaxJump()){
            System.out.printf("%s удалось перепрыгнуть через стену %d см.\n",
                    getName(), height);
            return true;
        }
        else{
            System.out.printf("%s не смог перепрыгнуть через стену %d см, остался на месте.\n",
                    getName(), height);
            return false;
        }
    }

    default boolean run(int length) {
        if (length <= getMaxRun()){
            System.out.printf("%s удалось пробежать %d м.\n",
                    getName(), length);
            return true;
        }
        else{
            System.out.printf("%s не смог пробежать %d м, остался на месте.\n",
                    getName(), length);
            return false;
        }
    }

}
