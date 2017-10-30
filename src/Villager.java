import java.util.ArrayList;

public class Villager extends Thread {

    final String Name = Addict.NamesList[(int) (Math.random()*Addict.NamesList.length)];
    int StartAge = Addict.rnd(20, 50);
    int Age = StartAge;
    int Hung = 25;//(int) (Math.random()*100)
    boolean isAlive = true;

    Villager(){
        Info.newVillager(Name, Age);
        start();
    }

    @Override
    public void run() {
        new Hunger();
        new Aging();
    }






























    public class Hunger extends Thread {

        Hunger(){
            start();
        }

        @Override
        public void run() {
            super.run();
            while(Hung != 0){
                Hung--;
                if ( Hung <= Addict.rnd(5, 20) && Storage.isMeal ){
                    Eat();
                } else if ( Hung == 4 && !Storage.isMeal ){
                    Info.deathwarnfood(Name);
                }

                    try {
                        Thread.sleep(1000 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
            Death.deathfromstarve(Name, Age, StartAge, isAlive);
            new Villager();
        }

        public void Eat(){
            int Taken = Storage.TakeFood(Addict.rnd(Hung, 100) - Hung);
            Hung+= Taken;
            System.out.println(Name + " сьел " + Taken + " ед. еды.");
            Info.food();
        }
    }


    public class Aging extends Thread{

        Aging(){
            start();
        }

        @Override
        public void run() {
            super.run();
            while( isAlive ) {
                try {
                    Thread.sleep(24000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if ( !isAlive ) break;
                System.out.println(Name + " постарел на год, теперь ему " + Age);
                Age++;
            }
        }
    }




}
