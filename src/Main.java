import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        /* //Обобщение типов
        Database<Integer, Double> db = new Database(1, "test", 15);
        //Дженерики работают только со ссылочными типами данных
        Database<String, String> db1 = new Database<>("2","test1", "123");
        System.out.println(db.getId());
        System.out.println(db1.getId());
        System.out.println(db.getAge());
        System.out.println(db1.getAge());
        Database.<String>printHello();*/

/*        //коллекции
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(851);
        list.add(89);
        System.out.println(list);
        System.out.println(list.contains(4));//поиск элемента
        list. remove(1);//удаление элемента
        System.out.println(list);
        System.out.println(list.get(1));
        for (Integer value : list) {
            System.out.println(value);
        }*/

        //Map
        HashMap<String, Integer> map = new HashMap<>();
//        map.get();//передаём ключ и если существует такой то привязывается значение
        map.put("first", 1);
        map.put("second", 2);
        map.put("thrid", 3);
        map.put("fourth", 4);
        System.out.println(map.get("thrid"));
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            System.out.println("Ключ - " + value.getKey() + "значение - " + value.getValue());//можем работать отдельно с ключем или значением

        }

    }
}
