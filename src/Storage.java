public class Storage {
    static int Meal = 10;
    static boolean isMeal = true;
    static int Wood = 1000;

    public static int TakeFood(int meal) {
        if ( Meal > 0 && meal < Meal ) {
            Meal -= meal;
        } else if ( Meal > 0 && meal > Meal ) {
            meal = Meal;
            Meal = 0;
            isMeal = false;
        } else if ( Meal == 0 ){
            isMeal = false;
            meal = 0;
        }
        return meal;
    }
    public static void addFood(int meal){
        Meal += meal;
        System.out.println("Склад пополнился на " + meal + " ед. пищи..");
        isMeal = true;
    }
}
