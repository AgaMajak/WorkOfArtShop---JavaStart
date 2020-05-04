import data.*;
import logic.Document;

class ShopTest {
    public static void main(String[] args) {
        Address[] addresses = {
                new Address("Wrocław", "Żeromskiego", "15"),
                new Address("Kraków", "Piękna", "12A/4"),
                new Address("Wrocław", "Pl. Wolności", "14")
        };

        Client[] clients = {
                new Company(false, addresses[0], "Gwiazdkowo"),
                new Company(true, addresses[1], "Galeria Sztuki 'Nowalijka'"),
                new NaturalPerson(true, "Jan", "Kowalski"),
                new NaturalPerson(false, "Adam", "Nowak")
        };

        Product[] products = {
                new Product("Obraz", "Tulipany", "Anita Jastrząb", 500),
                new Product("Rzeźba", "Gniazdo", "Piotr Guzik", 1000),
                new Product("Obraz", "Moje miasto", "Stefan Wiśniewski", 750),
                new Product("Plakat", "Lonely day", "George Smith", 5000)
        };

        Document.printDocument(clients[0], products[3]);
        Document.printDocument(clients[3], products[1]);
        Document.printDocument(clients[2], products[0]);

    }

}