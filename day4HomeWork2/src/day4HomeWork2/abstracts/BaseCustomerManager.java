package day4HomeWork2.abstracts;

import day4HomeWork2.entitites.Customer;

public abstract class BaseCustomerManager implements ICustomerService{


	public void save(Customer customer) {
		System.out.println("veri taban�na kaydedildi "+customer.getFirstName());
		
	}

}
