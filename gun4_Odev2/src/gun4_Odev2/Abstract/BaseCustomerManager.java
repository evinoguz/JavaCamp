package gun4_Odev2.Abstract;

import gun4_Odev2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritaban�na eklendi : "+customer.getFirstName()+" "+customer.getLastName());
	}

}
