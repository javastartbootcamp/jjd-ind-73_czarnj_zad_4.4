package pl.javastart.task;

import pl.javastart.task.services.CustomerService;
import pl.javastart.task.offers.SalesRepresentative;
import pl.javastart.task.offers.Offer;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}