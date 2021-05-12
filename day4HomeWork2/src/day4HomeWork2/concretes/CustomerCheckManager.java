package day4HomeWork2.concretes;

import day4HomeWork2.abstracts.ICustomerCheckService;

import day4HomeWork2.entitites.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
