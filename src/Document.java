public class Document {
    Client client;
    Product product;

    void returnDocument() {
        if (client.getCompanyName() == null) {
            if (client.isPremium()) {
                System.out.printf("Zakupiony produkt: typ - %s; Tytuł-'%s'; Autor-%s; cena przed obniżką:%.2fzł; cena po obniżce:%.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice(), product.getPrice() - (0.1 * product.getPrice()));
            } else
                System.out.printf("Zakupiony produkt: typ - %s; Tytuł-'%s'; Autor-%s; cena obniżką:%.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice());
        } else if (client.isPremium()) {
            System.out.printf("Zakupiony produkt: typ - %s; Tytuł-'%s'; Autor-%s; cena przed obniżką:%.2fzł; cena po obniżce:%.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice(), product.getPrice() - (0.1 * product.getPrice()));
            System.out.printf("Nabywca: %s, adres: %s %s, %s", client.getCompanyName(), client.getAddress().getCity(), client.getAddress().getStreetName(), client.getAddress().getBuildingNumber());
        } else
            System.out.printf("Zakupiony produkt: typ - %s; Tytuł-'%s'; Autor-%s; cena obniżką:%.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice());
        System.out.printf("Nabywca: %s, adres: %s %s, %s", client.getCompanyName(), client.getAddress().getCity(), client.getAddress().getStreetName(), client.getAddress().getBuildingNumber());
    }


}
