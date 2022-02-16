package Lesson4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        User user1 = new User("Lol", "lol");
//        User user2 = new User("1337", "1337");
//        User user3 = new User("322", "322");
//
//        User[] users = new User[]{user1, user2, user3};
//        for (int i = 0; i < 3; i++) {
//            if(users[i].password.equals("1337") && users[i].username.equals("1337")); {
//                System.out.println("Пользователь пропущен на сайт");
//                break;
//            }
//
//        }
        ArrayList<String> arrayList = new ArrayList<>();

        //добавление
        arrayList.add("3117");
        System.out.println(arrayList);
        //удаление
        arrayList.remove(0); //индекс
        System.out.println(arrayList);
        //чтение
        arrayList.add("1111111");
        System.out.println(arrayList.get(0));
        arrayList.add("1111111");
        arrayList.add("1111111");
        System.out.println(arrayList + " " + arrayList.size());
//        HashMap<Integer, String> users = new HashMap<>();
//
//        users.put(15, "111");
//        users.put(14, "222");
//        users.put(13, "333");
//        users.put(13, "333");
//        users.put(1337, "4444");
//
//        System.out.println(users);
//
//        System.out.println((users.get(13)));
//
//        users.remove(13);
//        System.out.println(users);
        HashMap<String, String> users = new HashMap<>();

        users.put("darklord", "hellokitty13");
        users.put("darklord12", "hellokitty13");
        users.put("darklor13", "hellokitty13");
        users.put("darklord14", "hellokitty");
        System.out.println("###############################################");
        System.out.println(users);


        LinkedHashMap<String, String> users2 = new LinkedHashMap<>();

        users2.put("darklord", "hellokitty13");
        users2.put("darklord12", "hellokitty13");
        users2.put("darklor13", "hellokitty13");
        users2.put("darklord14", "hellokitty");
        System.out.println("#########################################");
        System.out.println(users2);



        TreeMap<String, String> users3 = new TreeMap<>();

        users3.put("darklord", "hellokitty13");
        users3.put("darklord12", "hellokitty13");
        users3.put("darklor13", "hellokitty13");
        users3.put("darklord14", "hellokitty");
        users3.put("darklord", "hellokitty13");
        users3.put("darklord12", "hellokitty13");
        users3.put("darklor13", "hellokitty13");
        System.out.println("33333333############################");
        System.out.println(users3);




        for (Map.Entry<String, String> entry: users.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        String message = "Привет, я хочу стать самым лучшим тестировщиком, и я им буду!"; // исмволы повторы

        HashMap<Character, Integer> repeats = new HashMap<>();



        char[] charInMessage = message.toCharArray();
// Добавить символ если его нет с значением повторов 1
        //если символ есть увеличить его значение на 1
        for (char character: charInMessage) {
            if(repeats.get(character) == null) {
                repeats.put(character, 1);
            }
            else {
                repeats.put(character, repeats.get(character) + 1);
            }



            repeats.put(character, 1);

        }



        System.out.println(repeats);

    }


}
 /*   class User {

        String username;
        String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

*/
