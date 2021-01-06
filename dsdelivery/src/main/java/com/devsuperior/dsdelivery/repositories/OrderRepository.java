package com.devsuperior.dsdelivery.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsdelivery.entities.Product;
@Repository
public interface OrderRepository extends JpaRepository<Product,Long> {

}
