package logic;

import data.Client;
import data.Company;
import data.NaturalPerson;
import data.Product;

public class Document {
    public static void printDocument(Client client, Product product) {
        if (client instanceof Company) {
            Invoice invoice = new Invoice();
            invoice.printInvoice((Company) client, product);
        }
        if (client instanceof NaturalPerson) {
            Receipt receipt = new Receipt();
            receipt.printReceipt((NaturalPerson) client, product);
        }
    }
}
