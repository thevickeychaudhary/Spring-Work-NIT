package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vc.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer>
{

}
