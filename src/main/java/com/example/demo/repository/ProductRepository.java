package com.example.demo.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Product;
import java.util.List;
public interface ProductRepository extends CrudRepository<Product, Integer> {
	List<Product> findByColor(String color);
	List<Product> findBySeason(String season);
	List<Product> findByBrand(String brand);
	List<Product> findByCatagory(String catagory);
	List<Product> findByPrice(Integer price);
	List<Product> findByCreatedDate(String date);
	@Query(value ="select * from prod_table prod, user_table u, product_order po where po.user=u.userID and po.prod = prod.productId",nativeQuery = true)
	List<Object> findByProductOrder();
}
