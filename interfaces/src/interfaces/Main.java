package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer evin=new Customer(1,"Evin","O�uz");
		Logger[] loggers= {new SmsLogger(),new DatabaseLogger()};
		CustomerManager customerManager=new CustomerManager(loggers); // interface s�n�f�nda ba��ml�l��� smstir
		customerManager.add(evin);
	}

}