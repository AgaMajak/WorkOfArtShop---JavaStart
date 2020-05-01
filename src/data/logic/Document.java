package data.logic;

import data.Client;
import data.Product;

public class Document {
    private Client client;
    private Product product;

    public Document(Client client, Product product) {
        this.client = client;
        this.product = product;
    }

    public void returnDocument() {
        if (client.getCompanyName() == null) {
            if (client.isPremium()) {
                System.out.printf("PARAGON: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena przed obniżką: %.2fzł; cena po obniżce: %.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice(), product.getPrice() - (0.1 * product.getPrice()));
            } else
                System.out.printf("PARAGON: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena: %.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice());
        } else if (client.getCompanyName() != null) {
            if (client.isPremium()) {
                System.out.printf("FAKTURA: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena przed obniżką: %.2fzł; cena po obniżce: %.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice(), product.getPrice() - (0.1 * product.getPrice()));
                System.out.printf("Nabywca: %s, adres: %s, %s %s.", client.getCompanyName(), client.getAddress().getCity(), client.getAddress().getStreetName(), client.getAddress().getBuildingNumber());
            } else {
                System.out.printf("FAKTURA: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena: %.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice());
                System.out.printf("Nabywca: %s, adres: %s, %s %s.\n", client.getCompanyName(), client.getAddress().getCity(), client.getAddress().getStreetName(), client.getAddress().getBuildingNumber());
            }


        }


    }
}
