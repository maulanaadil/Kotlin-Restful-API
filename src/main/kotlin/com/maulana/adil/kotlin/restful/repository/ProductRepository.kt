package com.maulana.adil.kotlin.restful.repository

import com.maulana.adil.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String>{

}