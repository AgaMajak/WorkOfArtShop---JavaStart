class ShopTest {
    public static void main(String[] args) {
        Address address = new Address("Wrocław", "Jaworska","5/115");
        Client client = new Client("Jan","Kowalski", "Gwiazdka", address,true);

        Product product = new Product("Obraz", "Tulipany","Adam Nowak", 500);

        Document document = new Document(client,product);

        document.returnDocument();

    }

}
