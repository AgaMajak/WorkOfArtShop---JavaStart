package data.logic;

import data.NaturalPerson;
import data.Product;

public class Receipt extends Document {
    NaturalPerson naturalPerson;

    public Receipt(Product product, NaturalPerson naturalPerson) {
        super(product);
        this.naturalPerson = naturalPerson;
    }

    @Override
    public void printDocument() {
        if (naturalPerson.isPremium()) {
            System.out.printf("PARAGON: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena przed obniżką: %.2fzł; cena po obniżce: %.2fzł.\n", getProduct().getType(), getProduct().getTitle(), getProduct().getAuthor(), getProduct().getPrice(), getProduct().getPrice() - (0.1 * getProduct().getPrice()));
        } else
            System.out.printf("PARAGON: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena: %.2fzł.\n", getProduct().getType(), getProduct().getTitle(), getProduct().getAuthor(), getProduct().getPrice());
    }

}
