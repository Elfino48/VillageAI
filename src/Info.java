public class Info {
    public static void food(){
        if ( Storage.Meal > 0 ){
            System.out.println(Storage.Meal + " ед. пищи осталось..");
        } else {
            System.out.println("На складе закончилась пища..");
        }
    }
    public static void newVillager(String Name, int Age){
        System.out.println( Name + " пришел в деревню." );
        System.out.println( "Ему " + Age + "." );
    }
    public static void deathwarnfood(String Name){
        System.out.println(Name + " умирает от голода..");
    }
}
