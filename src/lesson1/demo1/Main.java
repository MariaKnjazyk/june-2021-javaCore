package lesson1.demo1;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        String[] skls = {"qwe", "asd"};

        User user2 = new User(2, "vasja", true, skls);

        User user3 = new User(100, "kokos", false ,new String[]{"asd", "zxc"});
        System.out.println(user.isStatus());
        System.out.println(user2);
    }
}
