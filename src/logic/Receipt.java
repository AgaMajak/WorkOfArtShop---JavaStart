package logic;

import data.NaturalPerson;
import data.Product;

public class Receipt extends Document {

    public void printReceipt(NaturalPerson naturalPerson, Product product) {
        if (naturalPerson.isPremium()) {
            System.out.printf("PARAGON: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena przed obniżką: %.2fzł; cena po obniżce: %.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice(), product.getPrice() - (0.1 * product.getPrice()));
        } else
            System.out.printf("PARAGON: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena: %.2fzł.\n", product.getType(), product.getTitle(), product.getAuthor(), product.getPrice());
    }

}
