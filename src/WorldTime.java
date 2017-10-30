import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

public class WorldTime extends Thread {
    int time = 12;
    int day = 1;
    WorldTime(){
        start();
    }

    @Override
    public void run() {
        super.run();
        while(true){
            if ( time == 24 ) {
                time = 0;
                day++;
            }
            System.out.println(time + ":00, день " + day);
            time++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
