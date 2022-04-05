package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
       SellerDao sellerDao = DaoFactory.createSellerDao();
       
       Seller seller = sellerDao.findById(1);
       System.out.println(" ==== TEST 1: Seller FindById =====");
       System.out.println(seller);
       
       System.out.println("\n==== TEST 2: Seller findByDepartment ===== ");
       Department departament1 = new Department(1, null);
       List<Seller>list = sellerDao.findByDepartament(departament1);
       for(Seller sl : list) {
    	   System.out.println(sl);
       }
       
       System.out.println("\n==== TEST 3: Seller findAll ===");
       Department departament2 = new Department(2, null);
       List<Seller> listaSeller = sellerDao.findAll();
       for(Seller sellerT2 : listaSeller) {
    	   System.out.println(sellerT2);
       }
       System.out.println("\n==== TEST 4: Seller insert =====");
       Seller se = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0,departament1);
       sellerDao.insert(se);
       System.out.println(se.getId());
       
       System.out.println("\n==== TEST 5: Seller update =====");
       se = sellerDao.findById(1);
       se.setName("Pedro Rocha");
       sellerDao.update(se);
       System.out.println("Update Completed");
       
       System.out.println("\n==== TEST 6: Seller Delete =====");
       sellerDao.deleteById(9);
       System.out.println("Delete Completed");
	}
}
