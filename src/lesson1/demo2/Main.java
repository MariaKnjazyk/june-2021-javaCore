package lesson1.demo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> skls = new ArrayList<>();

        skls.add("qwe");
        skls.add("asd");
        skls.add("zxc");
        skls.add("vbn");

        Client client1 = new Client(1, "vasja", skls);

        Client client2 = new Client(3, "petja", skls);
        Client client3 = new Client( "petja");

        client1.getSkills().add("mnb");

        System.out.println(client1);

        client1.getSkills().remove(0);

        System.out.println(client1);

        ArrayList<Client> clients = new ArrayList<>();

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(new Client());

        for (int i = 0; i < clients.size(); i++) {
            System.out.println(clients.get(i));
        }

        System.out.println("--------------------");

        for (Client client : clients) {
            System.out.println(client);
        }

        System.out.println("--------------------");

        Client masha1 = new Client("masha");
        Client masha2 = new Client("masha");

        System.out.println(masha1 == masha2);
        System.out.println(masha1.equals(masha2));

        System.out.println(masha1.greeting());
    }
}
