public class Death {
    public static void deathfromstarve(String Name, int Age, int StartAge, boolean isAlive){
        System.out.println(Name + " умер от голода. Он прожил в деревне " + (Age - StartAge) + " лет.");
        isAlive = false;
    }
}