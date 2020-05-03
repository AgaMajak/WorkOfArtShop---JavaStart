import data.Address;
import data.Company;
import data.NaturalPerson;
import data.Product;
import logic.Document;
import logic.Invoice;
import logic.Receipt;

class ShopTest {
    public static void main(String[] args) {
        Address[] addresses = {
                new Address("Wrocław", "Żeromskiego", "15"),
                new Address("Kraków", "Piękna", "12A/4"),
                new Address("Wrocław", "Pl. Wolności", "14")
        };

        Company[] companies = {
                new Company(false, addresses[0], "Gwiazdkowo"),
                new Company(true, addresses[1], "Galeria Sztuki 'Nowalijka'")
        };

        NaturalPerson[] naturalPeople = {
                new NaturalPerson(true, "Jan", "Kowalski"),
                new NaturalPerson(true, "Jan", "Kowalski")
        };


        Product[] products = {
                new Product("Obraz", "Tulipany", "Anita Jastrząb", 500),
                new Product("Rzeźba", "Gniazdo", "Piotr Guzik", 1000),
                new Product("Obraz", "Moje miasto", "Stefan Wiśniewski", 750),
                new Product("Plakat", "Lonely day", "George Smith", 5000)
        };

        Document[] documents = {
                new Receipt(products[0], naturalPeople[0]),
                new Receipt(products[1], naturalPeople[1]),
                new Invoice(products[2], companies[0]),
                new Invoice(products[3], companies[1]),
        };


        for (Document document : documents) {
            document.printDocument();
            System.out.println();
        }

    }

}
