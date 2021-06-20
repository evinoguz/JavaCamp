package interfaces;

public class CustomerManager {
	// loosly(gev�ek) - tightly(kat� ba�l�l�k) coupled
	
	private Logger[] loggers= {}; // Sa� t�kla->Source->Generate Constructor using fields ile otomatik olu�turur.
	
	public CustomerManager() {
	}
	public CustomerManager(Logger[] loggers) {
		this.loggers=loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("M��teri eklendi "+customer.getFirstName());
		//tightly
		//DatabaseLogger logger=new DatabaseLogger();
		//logger.log(customer.getFirstName()+" veritaban�na logland�.");
		Utils.runLogger(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi "+customer.getFirstName());
		//DatabaseLogger logger=new DatabaseLogger();
		//logger.log(customer.getFirstName()+" veritaban�na logland�.");
		Utils.runLogger(loggers, customer.getFirstName());
	}
}
