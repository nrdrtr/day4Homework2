package day4HomeWork2.adapters;

import java.rmi.RemoteException;

import day4HomeWork2.abstracts.ICustomerCheckService;
import day4HomeWork2.entitites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()),customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
			
		} catch ( RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
