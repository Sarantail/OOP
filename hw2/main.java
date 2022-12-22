package hw2;

import org.example.controller.automate;
import org.example.entityes.product;
import org.example.repository.repository;
import org.example.serviceis.service;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        repository Repository = new repository();

        repository.addProduct(new Product(1, "1"));

        service pizzaService = new service(repository);

        automate vendingMachineController = new automate(service);

        System.out.println(automate.getProduct("1"));
        System.out.println(Arrays.toString(automate.getMenu()));
    }
}
