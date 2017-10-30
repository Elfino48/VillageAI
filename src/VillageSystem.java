import java.util.Timer;

public class VillageSystem {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 1; i++) {
            new WorldTime();
            Thread.sleep(10);
            new Villager();
        }
    }
}
