package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao,LoggerService loggerService) { //Hibernate gerek yok. referans�n� tutar.
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;

	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor.");
			return;
		}
		this.productDao.add(product); //Hibernate ile ba��ml�l�k yok.
		this.loggerService.logToSystem("�r�n eklendi : "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
