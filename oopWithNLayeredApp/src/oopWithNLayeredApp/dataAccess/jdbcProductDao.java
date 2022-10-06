package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao {
	public void add(Product product) {
		//db erişim kodları buraya yazılıyor
		System.out.println("JBDC ile veritabanına eklendi");
		
	}
}

//Hibernate