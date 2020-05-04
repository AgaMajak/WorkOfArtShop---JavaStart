package logic;

import data.Company;
import data.Product;

public class Invoice extends Document {

    public void printInvoice(Company company, Product product) {
        if (company.isPremium()) {
            System.out.printf("FAKTURA: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena przed obniżką: %.2fzł; cena po obniżce: %.2fzł.\nNabywca: %s, adres: %s, %s %s.\n",
                    product.getType(), product.getTitle(), product.getAuthor(), product.getPrice(), product.getPrice() - (0.1 * product.getPrice()), company.getCompanyName(), company.getAddress().getCity(), company.getAddress().getStreetName(), company.getAddress().getBuildingNumber());
        } else {
            System.out.printf("FAKTURA: Zakupiony produkt: %s: Tytuł-'%s'; Autor- %s; cena: %.2fzł.\nNabywca: %s, adres: %s, %s %s.\n",
                    product.getType(), product.getTitle(), product.getAuthor(), product.getPrice(), company.getCompanyName(), company.getAddress().getCity(), company.getAddress().getStreetName(), company.getAddress().getBuildingNumber());
        }
    }
}
