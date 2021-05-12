package day4HomeWork2;

import day4HomeWork2.abstracts.BaseCustomerManager;
import day4HomeWork2.adapters.MernisServiceAdapter;
import day4HomeWork2.concretes.StarbucksCustomerManager;
import day4HomeWork2.entitites.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"nurullah", "diri", 2000, "12345678901"));

	}

}
