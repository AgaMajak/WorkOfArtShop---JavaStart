package logic;

import data.Company;
import data.Product;

public class Invoice extends Document {
    Company company;

    public Invoice(Product product, Company company) {
        super(product);
        this.company = company;
    }

    @Override
    public void printDocument() {
        if (company.isPremium()) {
            System.out.printf("FAKTURA: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena przed obniżką: %.2fzł; cena po obniżce: %.2fzł.\nNabywca: %s, adres: %s, %s %s.\n",
                    getProduct().getType(), getProduct().getTitle(), getProduct().getAuthor(), getProduct().getPrice(), getProduct().getPrice() - (0.1 * getProduct().getPrice()), company.getCompanyName(), company.getAddress().getCity(), company.getAddress().getStreetName(), company.getAddress().getBuildingNumber());
        } else {
            System.out.printf("FAKTURA: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena: %.2fzł.\nNabywca: %s, adres: %s, %s %s.\n",
                    getProduct().getType(), getProduct().getTitle(), getProduct().getAuthor(), getProduct().getPrice(), company.getCompanyName(), company.getAddress().getCity(), company.getAddress().getStreetName(), company.getAddress().getBuildingNumber());
        }
    }
}
