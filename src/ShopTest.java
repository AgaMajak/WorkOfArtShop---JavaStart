import data.Address;
import data.Client;
import data.logic.Document;
import data.Product;

class ShopTest {
    public static void main(String[] args) {
        Address[] addresses = {
                new Address("Wrocław","Żeromskiego","15"),
                new Address("Kraków", "Piękna","12A/4"),
                new Address("Wrocław", "Pl. Wolności", "14")
        };

        Client[] clients = {
                new Client("Jan", "Kowalski",null,null, true),
                new Client("Dagmara", "Nowak","Gwiazdkowo", addresses[0],false),
                new Client("Jacek","Stępień",null,null,false),
                new Client("Anna", "Kwiatkowska", "Galeria Sztuki 'Nowalijka'", addresses[1],true)
        };

        Product[] products ={
                new Product("Obraz", "Tulipany","Anita Jastrząb", 500),
                new Product("Rzeźba", "Gniazdo", "Piotr Guzik", 1000),
                new Product("Obraz", "Moje miasto", "Stefan Wiśniewski",750),
                new Product("Plakat", "Lonely day", "George Smith", 5000)
        };

        Document[] documents={
                new Document(clients[0],products[0]),
                new Document(clients[1],products[1]),
                new Document(clients[2],products[2]),
                new Document(clients[3],products[3]),
        };

        for (Document document: documents) {
            document.returnDocument();
            System.out.println();
        }

    }

}
