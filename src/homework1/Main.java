package homework1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();

        ArrayList<String> order = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            animals.add(new Animal("pet" + Integer.toString(i + 1) , 5+i, "something") );

            books.add(new Book("book" + Integer.toString(i + 1), 6 * i, "someGenre", 1980 + i * 3));

            order.add("some" + Integer.toString(i + 1));
            String clientName = "client" + Integer.toString(i + 1);
            clients.add(new Client(i + 1, clientName, 80501234560L + i, clientName + "@test.com", order ));
        }

        for (Client client : clients) {
            System.out.println(client);
        }

        System.out.println("--------------");

        int i = 0;
        do {
            System.out.println(books.get(i));
            i++;
        }
        while (i < 10);

        System.out.println("--------------");

        i--;

        while (i > 0) {
            System.out.println(animals.get(i));
            i--;
        }

    }
}
