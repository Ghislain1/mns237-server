package org.mns237.dao;

import org.mns237.entity.Products;
import org.mns237.entity.Comments;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface ProductsRepository extends CrudRepository<Products, Long> {
    
   // @Query(value="select * from comments c, products p WHERE p.id = c.products", nativeQuery = true)
    List<Products> findAll();
    Optional<Products> findById(Long id);
}
