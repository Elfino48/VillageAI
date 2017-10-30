public class Addict {

    final static String NamesList[] = {"Георгий", "Вилли", "Джеймс", "Тревор", "Гарри", "Иван",
            "Кирилл", "Илья", "Эльмар", "Джастин", "Константин", "Евгений", "Влад", "Олег", "Андрей"};

    public static int rnd(int min, int max){
         max -= min;
         return (int) (Math.random() * ++max) + min;
     }
}
