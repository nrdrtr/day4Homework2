package day4HomeWork2.concretes;

import day4HomeWork2.abstracts.BaseCustomerManager;
import day4HomeWork2.abstracts.ICustomerCheckService;
import day4HomeWork2.entitites.Customer;
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	    ICustomerCheckService customerCheckService;
	
        public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
		@Override
        public void save(Customer customer) {
			
			if(customerCheckService.CheckIfRealPerson(customer)) {
				
        	super.save(customer);
        	
			}else{
				System.out.println("geçerli bir kiþi deðil");
			}
        }
}
